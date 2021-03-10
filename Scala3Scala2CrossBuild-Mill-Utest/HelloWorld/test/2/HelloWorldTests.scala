package helloworld

import utest._

object ScalaDateTests extends TestSuite{
  println("TESTS VERSION 2.13.2 running")
  val tests = Tests{
    test("checkVersion"){
      println(HelloWorld.versionCheck)
      assert(HelloWorld.versionCheck == "2.13.2")
    }
  }
}
