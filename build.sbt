ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "data_practice"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test->default"
)
