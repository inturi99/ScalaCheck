name := "ScalaCheck"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.7",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.2" % "test"
 )
