name := "user_manager_api"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

play.Project.playScalaSettings

mappings in Universal ++=
  (baseDirectory.value / "scripts" * "*" get) map
    (x => x -> ("scripts/" + x.getName))

mappings in Universal ++= Seq(baseDirectory.value / "build_version" -> "build_version").filter(_._1.exists)

org.scalastyle.sbt.ScalastylePlugin.Settings

// Create a default Scala style task to run with tests
lazy val testScalaStyle = taskKey[Unit]("testScalaStyle")

//testScalaStyle := {
//  org.scalastyle.sbt.PluginKeys.scalastyle.toTask("").value
//}

//(test in Test) <<= (test in Test) dependsOn testScalaStyle