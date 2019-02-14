
lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.8"

libraryDependencies += guice

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

BabelKeys.options := WebJs.JS.Object(
  "plugins" -> List("@babel/plugin-transform-react-jsx")
)

