import munit.*

class MunitSuite extends FunSuite {
    test("hello I am the MunitSuite test example"){
        val obtained = 42
        val expected = 42
        assertEquals(expected, obtained)
    }
}
