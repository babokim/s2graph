import java.text.{SimpleDateFormat, DateFormat}
import java.util.Date

import sbtassembly.Plugin.AssemblyKeys._


name := """s2core"""

version := Common.version

scalaVersion := Common.scalaVersion

scalacOptions ++= Seq("-deprecation")

resolvers ++= Common.resolvers

libraryDependencies ++= Seq(
  anorm,
  cache,
  ws,
  filters,
  "org.apache.hbase" % "hbase-client" % "0.98.6-cdh5.3.0" excludeAll ExclusionRule(organization = "org.slf4j"),
  "org.apache.hbase" % "hbase-common" % "0.98.6-cdh5.3.0" excludeAll ExclusionRule(organization = "org.slf4j"),
  "org.apache.hbase" % "hbase-server" % "0.98.6-cdh5.3.0" excludeAll(ExclusionRule(organization = "org.slf4j"), ExclusionRule(organization = "com.google.protobuf")),
  "org.apache.hadoop" % "hadoop-common" % "2.5.0-cdh5.3.0" excludeAll ExclusionRule(organization = "org.slf4j"),
  "mysql" % "mysql-connector-java" % "5.1.28",
  "commons-pool" % "commons-pool" % "1.6",
  "org.scalikejdbc" %% "scalikejdbc"        % "2.1.+",
  "com.twitter" %% "util-collection" % "6.12.1",
  "org.hbase" % "asynchbase" % "1.7.0-SNAPSHOT"
   )
   
