import sbt.Keys._

name := "devops-alerter"

val commonSettings = Seq(
  organization := "de.kaufhof",
  version := "1.0-SNAPSHOT",
  scalaVersion := "2.11.8",
  javacOptions ++= Seq("-source", "1.8", "-target", "1.8"),
  scalacOptions ++= Seq("-target:jvm-1.8", "-feature", "-Xlint", "-Ywarn-unused", "-Ywarn-value-discard", "-unchecked"),
  fork := true
)

lazy val alerter = project.in(file("alerter"))
  .settings(commonSettings:_*)
