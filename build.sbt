scalaVersion := "2.12.6"

val circeVersion = "0.9.3"
val http4sVersion = "0.18.13"
val rhoVersion = "0.18.0"

libraryDependencies ++= Seq(
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-shapes" % circeVersion,
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "rho-swagger" % rhoVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3"
)

scalacOptions ++= Seq("-Ypartial-unification")
