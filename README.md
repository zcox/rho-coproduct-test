`sbt run`

http://localhost:8080/swagger.json

```
2018-06-25 16:39:05.117 [scala-execution-context-global-23] INFO  org.http4s.rho.swagger.TypeBuilder - Failed to build model for type shapeless.Inl[H,T]
scala.ScalaReflectionException: type H is not a class
 at scala.reflect.api.Symbols$SymbolApi.asClass(Symbols.scala:272)
 at scala.reflect.api.Symbols$SymbolApi.asClass$(Symbols.scala:272)
 at scala.reflect.internal.Symbols$SymbolContextApiImpl.asClass(Symbols.scala:94)
 at org.http4s.rho.swagger.TypeBuilder$.org$http4s$rho$swagger$TypeBuilder$$isObjectEnum(TypeBuilder.scala:138)
 at org.http4s.rho.swagger.TypeBuilder$DataType$.fromType(TypeBuilder.scala:280)
 at org.http4s.rho.swagger.TypeBuilder$.$anonfun$typeToProperty$1(TypeBuilder.scala:194)
 at scala.PartialFunction.applyOrElse(PartialFunction.scala:123)
 at scala.PartialFunction.applyOrElse$(PartialFunction.scala:122)
 at scala.PartialFunction$$anon$1.applyOrElse(PartialFunction.scala:253)
 at org.http4s.rho.swagger.TypeBuilder$.typeToProperty(TypeBuilder.scala:176)
 at org.http4s.rho.swagger.TypeBuilder$.paramSymToProp(TypeBuilder.scala:170)
 at org.http4s.rho.swagger.TypeBuilder$.$anonfun$modelToSwagger$1(TypeBuilder.scala:151)
 at scala.collection.immutable.List.map(List.scala:283)
 at org.http4s.rho.swagger.TypeBuilder$.modelToSwagger(TypeBuilder.scala:151)
 at org.http4s.rho.swagger.TypeBuilder$.go$1(TypeBuilder.scala:68)
 at org.http4s.rho.swagger.TypeBuilder$.$anonfun$collectModels$9(TypeBuilder.scala:92)
 at scala.collection.TraversableLike.$anonfun$flatMap$1(TraversableLike.scala:241)
 at scala.collection.immutable.Set$Set2.foreach(Set.scala:130)
 at scala.collection.TraversableLike.flatMap(TraversableLike.scala:241)
 at scala.collection.TraversableLike.flatMap$(TraversableLike.scala:238)
 at scala.collection.AbstractTraversable.flatMap(Traversable.scala:104)
 at org.http4s.rho.swagger.TypeBuilder$.$anonfun$collectModels$8(TypeBuilder.scala:91)
 at scala.collection.TraversableLike.$anonfun$flatMap$1(TraversableLike.scala:241)
 at scala.collection.immutable.Set$Set1.foreach(Set.scala:95)
 at scala.collection.TraversableLike.flatMap(TraversableLike.scala:241)
 at scala.collection.TraversableLike.flatMap$(TraversableLike.scala:238)
 at scala.collection.AbstractTraversable.flatMap(Traversable.scala:104)
 at org.http4s.rho.swagger.TypeBuilder$.go$1(TypeBuilder.scala:88)
 at org.http4s.rho.swagger.TypeBuilder$.$anonfun$collectModels$6(TypeBuilder.scala:78)
 at scala.collection.immutable.List.flatMap(List.scala:335)
 at org.http4s.rho.swagger.TypeBuilder$.go$1(TypeBuilder.scala:72)
 at org.http4s.rho.swagger.TypeBuilder$.collectModels(TypeBuilder.scala:100)
 at org.http4s.rho.swagger.TypeBuilder$.collectModels(TypeBuilder.scala:21)
 at org.http4s.rho.swagger.SwaggerModelsBuilder.$anonfun$collectDefinitions$1(SwaggerModelsBuilder.scala:49)
 at scala.collection.TraversableOnce.$anonfun$foldLeft$1(TraversableOnce.scala:157)
 at scala.collection.TraversableOnce.$anonfun$foldLeft$1$adapted(TraversableOnce.scala:157)
 at scala.collection.immutable.Set$Set1.foreach(Set.scala:95)
 at scala.collection.TraversableOnce.foldLeft(TraversableOnce.scala:157)
 at scala.collection.TraversableOnce.foldLeft$(TraversableOnce.scala:155)
 at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
 at org.http4s.rho.swagger.SwaggerModelsBuilder.collectDefinitions(SwaggerModelsBuilder.scala:49)
 at org.http4s.rho.swagger.SwaggerModelsBuilder.mkSwagger(SwaggerModelsBuilder.scala:23)
 at org.http4s.rho.swagger.SwaggerSupport.$anonfun$createSwagger$1(SwaggerSupport.scala:64)
 at scala.collection.TraversableOnce.$anonfun$foldLeft$1(TraversableOnce.scala:157)
 at scala.collection.TraversableOnce.$anonfun$foldLeft$1$adapted(TraversableOnce.scala:157)
 at scala.collection.Iterator.foreach(Iterator.scala:944)
 at scala.collection.Iterator.foreach$(Iterator.scala:944)
 at scala.collection.AbstractIterator.foreach(Iterator.scala:1432)
 at scala.collection.IterableLike.foreach(IterableLike.scala:71)
 at scala.collection.IterableLike.foreach$(IterableLike.scala:70)
 at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
 at scala.collection.TraversableOnce.foldLeft(TraversableOnce.scala:157)
 at scala.collection.TraversableOnce.foldLeft$(TraversableOnce.scala:155)
 at scala.collection.AbstractTraversable.foldLeft(Traversable.scala:104)
 at org.http4s.rho.swagger.SwaggerSupport.createSwagger(SwaggerSupport.scala:64)
 at org.http4s.rho.swagger.SwaggerSupport.swaggerSpec$lzycompute$1(SwaggerSupport.scala:39)
 at org.http4s.rho.swagger.SwaggerSupport.swaggerSpec$1(SwaggerSupport.scala:37)
 at org.http4s.rho.swagger.SwaggerSupport.$anonfun$createRhoMiddleware$2(SwaggerSupport.scala:43)
 at org.http4s.rho.swagger.SwaggerSupport$$anon$1.response$lzycompute(SwaggerSupport.scala:89)
 at org.http4s.rho.swagger.SwaggerSupport$$anon$1.response(SwaggerSupport.scala:85)
 at org.http4s.rho.swagger.SwaggerSupport$$anon$1.$anonfun$new$1(SwaggerSupport.scala:97)
 at shapeless.ops.FnToProductInstances$$anon$1.$anonfun$apply$1(fntoproduct.scala:37)
 at org.http4s.rho.bits.MatchersHListToFunc$$anon$2.$anonfun$conv$2(HListToFunc.scala:35)
 at org.http4s.rho.bits.PathTreeOps.$anonfun$makeLeaf$2(PathTree.scala:93)
 at org.http4s.rho.bits.ResultResponse.map(ResultResponse.scala:35)
 at org.http4s.rho.bits.ResultResponse.map$(ResultResponse.scala:34)
 at org.http4s.rho.bits.SuccessResponse.map(ResultResponse.scala:51)
 at org.http4s.rho.bits.PathTreeOps.$anonfun$makeLeaf$1(PathTree.scala:92)
 at org.http4s.rho.bits.PathTreeOps$SingleLeaf.attempt(PathTree.scala:133)
 at org.http4s.rho.bits.PathTreeOps$Node.walkNil$1(PathTree.scala:255)
 at org.http4s.rho.bits.PathTreeOps$Node.walk(PathTree.scala:273)
 at org.http4s.rho.bits.PathTreeOps$Node.walk$(PathTree.scala:220)
 at org.http4s.rho.bits.PathTreeOps$MatchNode.walk(PathTree.scala:278)
 at org.http4s.rho.bits.PathTreeOps$Node.walkHeadTail$1(PathTree.scala:229)
 at org.http4s.rho.bits.PathTreeOps$Node.walk(PathTree.scala:272)
 at org.http4s.rho.bits.PathTreeOps$Node.walk$(PathTree.scala:220)
 at org.http4s.rho.bits.PathTreeOps$MatchNode.walk(PathTree.scala:278)
 at org.http4s.rho.bits.PathTreeOps$Node.walkTree(PathTree.scala:216)
 at org.http4s.rho.bits.PathTreeOps$Node.walkTree$(PathTree.scala:214)
 at org.http4s.rho.bits.PathTreeOps$MatchNode.walkTree(PathTree.scala:278)
 at org.http4s.rho.bits.PathTreeOps$PathTree.getResult(PathTree.scala:78)
 at org.http4s.rho.CompileService$.$anonfun$foldServices$2(CompileService.scala:47)
 at cats.data.KleisliSemigroupK.$anonfun$combineK$1(Kleisli.scala:353)
 at org.http4s.server.blaze.Http1ServerStage$$anon$2.$anonfun$run$1(Http1ServerStage.scala:147)
 at cats.effect.Sync$OptionTSync.$anonfun$suspend$3(Sync.scala:165)
 at cats.effect.internals.IORunLoop$.liftedTree1$1(IORunLoop.scala:93)
 at cats.effect.internals.IORunLoop$.cats$effect$internals$IORunLoop$$loop(IORunLoop.scala:93)
 at cats.effect.internals.IORunLoop$.start(IORunLoop.scala:35)
 at cats.effect.IO.unsafeRunAsync(IO.scala:260)
 at cats.effect.IO.$anonfun$runAsync$1(IO.scala:178)
 at scala.runtime.java8.JFunction0$mcV$sp.apply(JFunction0$mcV$sp.java:12)
 at cats.effect.internals.IORunLoop$.step(IORunLoop.scala:167)
 at cats.effect.IO.unsafeRunTimed(IO.scala:307)
 at cats.effect.IO.unsafeRunSync(IO.scala:242)
 at org.http4s.server.blaze.Http1ServerStage$$anon$2.run(Http1ServerStage.scala:152)
 at java.util.concurrent.ForkJoinTask$RunnableExecuteAction.exec(ForkJoinTask.java:1402)
 at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
 at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1056)
 at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1692)
 at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:157)
```
