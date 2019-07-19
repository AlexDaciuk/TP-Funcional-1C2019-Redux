import Dependencies._
import sbt._

lazy val commonSettings = Seq(
  organization := "fiuba.spf",
  scalaVersion := "2.13.0",
  dockerBaseImage := "openjdk:8-alpine"
)

lazy val db_loader = project.in(file("db-loader"))
  .settings(
    name := "db-loader",
    commonSettings,
    libraryDependencies := Dependencies.dbLoaderDependencies
  )
