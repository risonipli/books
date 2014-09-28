import sbt._
import Keys._

object BooksExercisesBuild extends Build {
  
  //lazy val root = project.in(file(".")).aggregates(scala_for_the_impatient)

  lazy val scala_for_the_impatient = Project("scala_for_the_impatient",
    file("./scala_for_the_impatient/"),
      settings = Seq(
          name := "scala_for_impatient",
          version := "0.1",
          scalaVersion := "2.11.2",
          libraryDependencies ++= Seq("org.scalatest" % "scalatest_2.11" % "2.2.2")
      )
  )
}
