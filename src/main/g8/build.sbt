import Dependencies._

ThisBuild / scalaVersion     := "2.13.8"

lazy val root = (project in file("."))
  .settings(testFrameworks += new TestFramework("weaver.framework.CatsEffect"))
  .settings {
    libraryDependencies ++= weaver
  }

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
