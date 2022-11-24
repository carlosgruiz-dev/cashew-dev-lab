import Dependencies._

enablePlugins(ScalaJSPlugin)

ThisBuild / scalaVersion     := "2.13.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "cloud.sp10"
ThisBuild / organizationName := "sp10"

lazy val root = (project in file("."))
  .settings(
    name := "Cashew Dev Lab",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"
)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
scalaJSUseMainModuleInitializer := true

