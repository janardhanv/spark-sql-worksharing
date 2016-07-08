name := "spark-sql-worksharing"

version := "1.0"

scalaVersion := "2.10.4"

resolvers += "apache-snapshots" at "https://repository.apache.org/snapshots/"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1-SNAPSHOT"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.1-SNAPSHOT"

libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.0.1-SNAPSHOT"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "com.typesafe.scala-logging" % "scala-logging-slf4j_2.10" % "2.1.2"

libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.4"