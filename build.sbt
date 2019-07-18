import Dependencies._

lazy val commonSettings = Seq(
  organization := "fiuba.spf",
  Dependencies.scalaVersion,
  Dependencies.dockerBaseImage
)
