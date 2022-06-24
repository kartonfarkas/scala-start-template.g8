package example

import weaver._

object HelloSuite extends SimpleIOSuite {
  pureTest("say a greeting") {
    expect( Hello.whatToSay() == "Wohooo!")
  }
}
