name := """imdb"""
version := "1.0"
scalaVersion := "2.12.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV       = "2.5.19"
  val akkaHTTP    = "10.1.5"
  val scalaTestV  = "3.0.4"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-stream" % akkaV,
    "com.typesafe.akka" %% "akka-http" % akkaHTTP,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHTTP,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHTTP % Test,
    "org.scalatest" %% "scalatest" % scalaTestV % Test,
    "org.scalamock" %% "scalamock" % "4.1.0" % Test
  )
}