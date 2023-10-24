package common

import munit.FunSuite
import scala.concurrent.duration.*

abstract class BaseSuite(using loc: munit.Location) extends FunSuite {
  override val munitTimeout = 1.minute
}
