val kafkaStreamsVersion = "0.12"

lazy val `kafka-eg` = project
  .in(file("."))
  .settings(
    organization := "net.lockney",
    scalaVersion := "2.11.8",
    scalacOptions ++= Vector(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding", "UTF-8"
    ),
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-stream-kafka" % kafkaStreamsVersion
    )
  )