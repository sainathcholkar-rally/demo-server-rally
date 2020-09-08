lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """demo-server-rally""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.12.1",
    libraryDependencies ++= Seq(
      guice,
      "io.swagger" %% "swagger-play2" % "1.7.1",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
