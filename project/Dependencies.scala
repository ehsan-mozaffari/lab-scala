import sbt.* // Sbt see this file as a .sbt file

object Dependencies {

  private object ver {
    val zio            = "2.0.18"
    val zioJson        = "0.6.2"
    val zioConfig      = "4.0.0-RC16"
    val zioLogging     = "2.1.14"
    val zioMock        = "1.0.0-RC11"
    val zioHttp        = "3.0.0-RC2"
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

    object test {
      object config { 
        val zioTestFramework = new TestFramework("zio.test.sbt.ZTestFramework") 
        val munitTestFramework = new TestFramework("munit.Framework") // If you are using a version of sbt lower than 1.5.0, you will also need to add this
    }
      val munit                         = Seq("org.scalameta" %% "munit" % ver.munit).map(_ % Test)
      val testContainersScalaPostgresql =
        Seq("com.dimafeng" %% "testcontainers-scala-postgresql" % ver.testContainers).map(_ % Test)
    }

    object db {

      val postgresql = Seq("org.postgresql" % "postgresql" % ver.postgresql) // Postgres JDBC driver
    }

    object log {
      val logbackClassic = Seq("ch.qos.logback" % "logback-classic" % ver.logbackClassic)
    }

  }

}
