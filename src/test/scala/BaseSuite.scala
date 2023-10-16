import munit.FunSuite
import scala.concurrent.duration.*


abstract class BaseSuite extends FunSuite{
  override val munitTimeout = 1.minute
}
