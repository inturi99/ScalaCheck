name := "ScalaCheck"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.7",
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test"
 )
