lazy val root = (project in file("."))
 .settings(
   name := "sbt-morphir",
   organization := "io.github.damianreeves",
   version := "0.1-SNAPSHOT",
   sbtPlugin := true,
   scriptedLaunchOpts += ("-Dplugin.version=" + version.value),
   scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
     a => Seq("-Xmx", "-Xms", "-XX", "-      Dsbt.log.noformat").exists(a.startsWith)
   ),
   scriptedBufferLog := false
 )