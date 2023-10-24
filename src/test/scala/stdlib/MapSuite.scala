package stdlib

import common.BaseSuite

class MapSuite extends BaseSuite {



  test("Remove a element from a Map using key with - operation") {
    assertEquals(
      Map(1 -> "a", 2 -> "b") - 1,
      Map(2 -> "b")
    )

    assertEquals(
      Map((1, 2) -> "a", (2, 3) -> "b") - ((1, 2)),
      Map((2, 3) -> "b")
    )
  }
}

object MapSuite {

  val test = 10
}
