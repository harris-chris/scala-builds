import mill._, mill.scalalib._

val supportedScala2Versions = List("2.13.2", "2.13.3")
val supportedScala3Versions = List("3.0.0-RC1")

trait Common extends CrossScalaModule {
  def millSourcePath = build.millSourcePath / "HelloWorld"
  def sources = T.sources(
    millSourcePath / "src",
    millSourcePath / scalaVersionNumber
  )
  def scalaVersionNumber: String
}

trait CommonTestModule extends ScalaModule with TestModule {
  def ivyDeps = Agg(ivy"com.lihaoyi::utest::0.7.7")
  def testFrameworks = Seq("utest.runner.Framework")
  def scalaBigVersionNumber = scalaVersionNumber(0)
  def sources = T.sources(
    millSourcePath / "src",
    millSourcePath / s"$scalaBigVersionNumber"
  )
  def scalaVersionNumber: String
}

object helloworld extends Module {
  object scala2 extends Cross[Scala2HelloWorldModule](supportedScala2Versions:_*)
  class Scala2HelloWorldModule(val crossScalaVersion: String) extends Common with ScalaModule {
    def scalaVersionNumber = crossScalaVersion
    def sources = T.sources(
      millSourcePath / crossScalaVersion / "main",
    )
    object test extends Tests with CommonTestModule { 
      def scalaVersionNumber = crossScalaVersion
    }
  }

  object scala3 extends Cross[Scala3HelloWorldModule](supportedScala3Versions:_*)
  class Scala3HelloWorldModule(val crossScalaVersion: String) extends Common with ScalaModule {
    def scalaVersionNumber = crossScalaVersion
    def sources = T.sources(
      millSourcePath / crossScalaVersion / "main",
    )
    object test extends Tests with CommonTestModule { 
      def scalaVersionNumber = crossScalaVersion
    }
  }
}
