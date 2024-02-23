import sbt.* // Sbt see this file as a .sbt file

object Dependencies {

  private object ver {
    val zio            = "2.0.18"
    val zioJson        = "0.6.2"
    val zioConfig      = "4.0.0-RC16"
    val zioLogging     = "2.1.14"
    val zioMock        = "1.0.0-RC11"
    val zioHttp        = "3.0.0-RC2"
    val catsCore       = "2.9.0"
    val catsEffect     = "3.4.8"
    val pureConfig     = "0.17.2"
    val http4s         = "1.0.0-M37"
    val tapir          = "1.2.9"
    val logback        = "1.4.5"
    val scalaLogging   = "3.9.5"
    val testContainers = "0.40.15"
    val quill          = "4.8.0"
    val postgresql     = "42.6.0"
    val logbackClassic = "1.4.7"
    val munit          = "0.7.29"
  }

  object lib {

    object zio {
      val core           = Seq("dev.zio" %% "zio" % ver.zio)
      val config         = Seq("dev.zio" %% "zio-config" % ver.zioConfig)
      val json           = Seq("dev.zio" %% "zio-json" % ver.zioJson)
      val logging        = Seq(
        "dev.zio" %% "zio-logging",
        "dev.zio" %% "zio-logging-slf4j",
      ).map(_ % ver.zioLogging)
      val stream         = Seq("dev.zio" %% "zio-streams" % ver.zio)
      val http           = Seq("dev.zio" %% "zio-http" % ver.zioHttp)
      val configTypeSafe = Seq("dev.zio" %% "zio-config-typesafe" % ver.zioConfig)

      val test = Seq(
        "dev.zio" %% "zio-test",
        "dev.zio" %% "zio-test-sbt",
        "dev.zio" %% "zio-test-junit",
        "dev.zio" %% "zio-test-magnolia",
      ).map(_ % ver.zio % Test)

    }

    object cats {
      val core   = Seq("org.typelevel" %% "cats-core" % ver.catsCore)
      // Cats effect core withSources() to download source without IDE plugin and same for withJavadoc()
      val effect = Seq("org.typelevel" %% "cats-effect" % ver.catsEffect withSources () withJavadoc ())
    }

    object api {
      object tapir {
        val core = Seq(
          "com.softwaremill.sttp.tapir" %% "tapir-core" % ver.tapir
        )

        val zio = Seq(
          "com.softwaremill.sttp.tapir" %% "tapir-zio-http"        % ver.tapir,
          "com.softwaremill.sttp.tapir" %% "tapir-zio-http-server" % ver.tapir,
        )

        val http4s = Seq(
          "com.softwaremill.sttp.tapir" %% "tapir-http4s-server" % ver.tapir
        )

        val circe = Seq(
          "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % ver.tapir,
          "io.circe"                    %% "circe-generic"    % "0.14.1",
        )

        val openapi = Seq(
          "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs"       % ver.tapir,
          "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % ver.tapir,
        )
      }

      object http4s {
        val dsl: Seq[ModuleID]         = Seq("org.http4s" %% "http4s-dsl" % ver.http4s)
        val emberServer: Seq[ModuleID] = Seq("org.http4s" %% "http4s-ember-server" % ver.http4s)
        val emberClient: Seq[ModuleID] = Seq("org.http4s" %% "http4s-ember-client" % ver.http4s)
        val core: Seq[ModuleID]        = dsl ++ emberServer ++ emberClient
      }
    }

    object test {
      object config {
        val zioTestFramework   = TestFrameworks.ZIOTest
        val munitTestFramework =
          TestFrameworks.MUnit // If you are using a version of sbt lower than 1.5.0, you will also need to add this
      }
      val munit = Seq("org.scalameta" %% "munit" % ver.munit).map(_ % Test)
      val scalaCheck                    = Seq("org.scalameta" %% "munit-scalacheck" % ver.munit).map(_ % Test)
      val testContainersScalaPostgresql =
        Seq("com.dimafeng" %% "testcontainers-scala-postgresql" % ver.testContainers).map(_ % Test)
    }

    object db {

      val postgresql = Seq("org.postgresql" % "postgresql" % ver.postgresql) // Postgres JDBC driver
    }

    object log {
      val logbackClassic = Seq("ch.qos.logback" % "logback-classic" % ver.logbackClassic)
      // a type safe scala logging lib that uses logback with slf4j
      val scalaLogging   = Seq("com.typesafe.scala-logging" %% "scala-logging" % ver.scalaLogging)
    }

    object config {
      // A type safe scala configuration management supports .conf .json .properties
      // TODO: change it to this: val pureConfig = Seq("com.github.pureconfig" %% "pureconfig" % ver.pureConfig).map(_.cross(CrossVersion.for3Use2_13))
      val pureConfigCore = Seq("com.github.pureconfig" %% "pureconfig-core" % ver.pureConfig)
    }

  }

}
