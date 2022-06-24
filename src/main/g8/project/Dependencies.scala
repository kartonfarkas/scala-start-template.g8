import sbt._

object Dependencies {
  lazy val weaver = Seq(
    "com.disneystreaming" %% "weaver-cats" % "0.7.11" % Test
  )
}
