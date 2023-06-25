// build.sbt used 

val scala3Version = "3.3.0"

// lazy - Configuring Build Tasks
lazy val root = project
  .in(file("."))
  .settings(
    name := "hello",
    version := "0.1.0-SNAPSHOT",

    // --- * Defining Project Settings * ---
    // scalaVersion - this is the v on scala
    scalaVersion := scala3Version,

    // libraryDependencies declare your project's dependencies.
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
