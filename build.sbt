import sbt._

enablePlugins(ScriptedPlugin)

organization := "org.spartanz"
name := "sbt-org-policies"
homepage := Some(url("https://github.com/spartanz/sbt-org-policies"))
licenses := List("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
developers := List(
  Developer(
      "vil1",
      "Valentin Kasas",
      "valentin.kasas@gmail.com",
      url("https://kanaka.io")
    )
  )

scalaVersion := "2.12.8"
sbtPlugin := true

scriptedLaunchOpts ++= {
  Seq("-Xmx1024M", "-Dplugin.version=" + version.value)
}

scriptedBufferLog := false

addSbtPlugin("de.heikoseeberger"  % "sbt-header"   % "5.2.0")
addSbtPlugin("com.dwijnand"       % "sbt-dynver"   % "4.0.0")
addSbtPlugin("com.dwijnand"       % "sbt-travisci" % "1.2.0")
addSbtPlugin("org.scalameta"      % "sbt-scalafmt" % "2.0.1")
addSbtPlugin("pl.project13.scala" % "sbt-jmh"      % "0.3.7")

scalafmtOnCompile := true
scalafmtConfig := baseDirectory.value / "src" / "main" / "resources" / "scalafmt.conf"
