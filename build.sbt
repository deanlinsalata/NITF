scalaVersion in ThisBuild := "2.11.7"

organization := "com.tresys"

name := "nitf"

version := "0.0.1"

testOptions in ThisBuild += Tests.Argument(TestFrameworks.JUnit, "-v")

resolvers in ThisBuild += "NCSA Sonatype Releases" at "https://opensource.ncsa.illinois.edu/nexus/content/repositories/releases"

libraryDependencies in ThisBuild := Seq(
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "edu.illinois.ncsa" %% "daffodil-tdml" % "2.0.0-rc1" % "test"
)

retrieveManaged := true

exportJars in ThisBuild := true

exportJars in Test in ThisBuild := true

publishArtifact in Test := true

