organization := "com.gourav"

name := "spark-sbt-test"

version := "0.10.0"

//sparkVersion := "2.3.1"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.3.1",
  "org.apache.spark" %% "spark-sql" % "2.3.1")
