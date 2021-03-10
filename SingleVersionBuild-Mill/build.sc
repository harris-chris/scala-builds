import mill._, api._, scalalib._

object ScalaDate extends ScalaModule {
  def scalaVersion = "3.0.0-RC1"
  def scalacOptions = Seq("-deprecation", "-encoding", "UTF8", "-feature")

  def forkArgs = Seq("-Xmx1g")
}
