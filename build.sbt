import Dependencies._

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version := "0.1.0-SNAPSHOT"
    )
  ),
  name := "scala-debug",
  libraryDependencies ++= Seq(
    booPickle,
    booPickleShapeless,
  ),
  scalacOptions ++= Seq(
//    "-Ypartial-unification",
    "-Ymacro-debug-lite",
  )
)
