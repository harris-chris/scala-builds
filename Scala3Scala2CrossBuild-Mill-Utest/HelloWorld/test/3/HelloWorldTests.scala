package helloworld

import utest._

object HelloWorldTests extends TestSuite{
  println("TESTS VERSION 3.0.0-RC1 running")
  val tests = Tests{
    test("checkVersion"){
      assert(HelloWorld.versionCheck == "3.0.0-RC1")
    }
  }
}
