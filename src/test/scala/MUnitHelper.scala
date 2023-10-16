import munit.FunSuite
import munit.Location
import munit.IgnoreSuite


abstract class MUnitHelper extends FunSuite {

  def check[T](
      name: String,
      original: List[T],
      expected: Option[T],
    )(using loc: Location
    ): Unit =
    test(name) {
      val obtained = original.headOption
      assertEquals(obtained, expected)
    }

}
