package app

import cats.effect._
import fs2._
import fs2.StreamApp.ExitCode
import org.http4s.rho._
import org.http4s.rho.swagger._
import org.http4s.server.blaze._
import org.http4s.circe._
import _root_.io.circe.generic.semiauto._
import _root_.io.circe.shapes._
import shapeless._
import scala.util.Random

object Main extends StreamApp[IO] {

  import scala.concurrent.ExecutionContext.Implicits.global

  type ISB = Int :+: String :+: Boolean :+: CNil

  object ISB {
    def random: ISB = Random.nextInt(3) match {
      case 0 => Coproduct[ISB](123)
      case 1 => Coproduct[ISB]("world")
      case 2 => Coproduct[ISB](true)
    }
  }

  case class IsbResponse(isb: ISB)

  object IsbResponse {
    implicit def encoder = deriveEncoder[IsbResponse]
    implicit def entityEncoder = jsonEncoderOf[IO, IsbResponse]
  }

  sealed trait Shape
  case class Circle(radius: Int) extends Shape
  case class Rectangle(width: Int, height: Int) extends Shape

  object Shape {
    def random: Shape = 
      if (Random.nextBoolean())
        Circle(Random.nextInt())
      else
        Rectangle(Random.nextInt(), Random.nextInt())

    implicit def encoder = deriveEncoder[Shape]
    implicit def entityEncoder = jsonEncoderOf[IO, Shape]
  }

  val httpService = new RhoService[IO] {
    GET / "isb" |>> {
      IO(Ok(IsbResponse(ISB.random)))
    }

    GET / "shape" |>> {
      IO(Ok(Shape.random))
    }
  }

  override def stream(args: List[String], requestShutdown: IO[Unit]): Stream[IO, ExitCode] =
    BlazeBuilder[IO]
      .bindHttp(8080, "0.0.0.0")
      .mountService(httpService.toService(SwaggerSupport[IO].createRhoMiddleware()), "/")
      .serve
}
