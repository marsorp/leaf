name := "bigdata-akka"

version := "1.0"

scalaVersion := "2.9.1-1"

javaHome := Some(file("/opt/jdk"))

fork := true

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.typesafe.akka" % "akka-actor" % "2.0"

libraryDependencies += "com.typesafe.akka" % "akka-slf4j" % "2.0"

 libraryDependencies += "com.typesafe.akka" % "akka-remote" % "2.0"

