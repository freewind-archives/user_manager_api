// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.3")

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

// Scala style plugin
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.5.0")