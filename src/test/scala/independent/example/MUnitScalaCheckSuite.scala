package independent.example

import munit.ScalaCheckSuite
import org.scalacheck.Prop.*

class MUnitScalaCheckSuite extends ScalaCheckSuite {

  property("addition is commutative") {
    forAll { (n1: Int, n2: Int) =>
      n1 + n2 == n2 + n1
    }
  }

  property("0 is the identity of addition") {
    forAll { (n: Int) =>
      n + 0 == n
    }
  }

  // ScalaCheck supports writing property checks as boolean expressions
  property("integer identities") {
    forAll { (n: Int) =>
      assertEquals(n + 0, n)
      assertEquals(n * 1, n)
    }
  }
  // The property above is equivalent to
  property("integer identities") {
    forAll { (n: Int) =>
      (n + 0 == n) && (n * 1 == n)
    }
  }
}
