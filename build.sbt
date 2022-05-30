ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "pyramid-tiler"
  )

libraryDependencies += "org.locationtech.geotrellis" %% "geotrellis-raster" % "3.6.2"
libraryDependencies += "org.locationtech.geotrellis" %% "geotrellis-spark" % "3.6.2"