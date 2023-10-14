import Dependencies._
logLevel := Level.Info

val scala3Version = "3.3.1"

resolvers ++= Resolver.sonatypeOssRepos("snapshots")

lazy val root = project
  .in(file("."))
  .settings(
    name           := "playground-scala3",
    version        := "0.1.0",
    scalaVersion   := scala3Version,
    libraryDependencies ++= Nil ++
      lib.zio.core ++
      lib.zio.config ++
      lib.zio.json ++
      lib.zio.logging ++
      lib.zio.stream ++
      lib.zio.http ++
      lib.zio.configTypeSafe ++
      lib.zio.test ++
      lib.test.munit ++
      lib.test.testContainersScalaPostgresql ++
      lib.db.postgresql ++
      lib.log.logbackClassic ++
      Nil,
    testFrameworks := Seq(
      lib.test.config.zioTestFramework,
      lib.test.config.munitTestFramework,
      ),
  ).enablePlugins(JavaAppPackaging)
