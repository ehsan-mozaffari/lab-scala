package independent.example

import munit.*

class MunitSuite extends FunSuite {
  test("hello I am the MunitSuite test example") {
    val obtained = 42
    val expected = 42
    assertEquals(expected, obtained)
    assertEquals(clue(expected), clue(obtained)) // shows better explanation in case it fails
  }

  test("always fail like issue-456".fail) {
    assert(false) // It fails.
  }

  interceptMessage[java.lang.IllegalArgumentException]("Argument type mismatch") {
    throw IllegalArgumentException("Argument type mismatch")
  }

  assertNoDiff(
    clue(compileErrors("Set(2, 1).sorted")),clue(
    """|error:
       |value sorted is not a member of Set[Int], but could be made available as an extension method.
       |
       |The following import might make progress towards fixing the problem:
       |
       |  import munit.Clue.generate
       |
       |Set(2, 1).sorted
       |         ^
       |""".stripMargin,
  ))
}
