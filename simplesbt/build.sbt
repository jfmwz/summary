name := "name"

version := "0.1.0"

organization := "com.demo"

scalaVersion := "2.10.2"

resolvers ++= Seq(
                "snapshots"     at "http://oss.sonatype.org/content/repositories/snapshots",
                "releases"        at "http://oss.sonatype.org/content/repositories/releases",
                "releases_twitter" at "http://maven.twttr.com"
                )
