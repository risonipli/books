import org.scalatest.FunSuite

class ScalaBasicTest extends FunSuite {
  test("Check pow(sqrt(3), 2)") {
    assert(ScalaBasic.task2 ===2.9999999999999996)
  }

  test("Check 'crazy' * 3 is equal 'crazycrazycrazy'") {
    assert(ScalaBasic.task4 === "crazycrazycrazy")
  }

  test("Check 2^1024") {
    assert(ScalaBasic.task6 === BigInt("179769313486231590772930519078902473361797697894230657273430081157732675805500963132708477322407536021120113879871393357658789768814416622492847430639474124377767893424865485276302219601246094119453082952085005768838150682342462881473913110540827237163350510684586298239947245938479716304835356329624224137216"))
  }

  test("First letter of 'Jagermeister' is 'J'") {
    assert(ScalaBasic.getFirstLetter("Jagermeister") === 'J')
    assert(ScalaBasic.getFirstLetter("") === "")
  }

  test("Last letter of 'Jagermeister' is 'r'") {
    assert(ScalaBasic.getLastLetter("Jagermeister") === 'r')
    assert(ScalaBasic.getLastLetter("") === "")
  }
}
