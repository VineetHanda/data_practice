import org.scalatest.funsuite.AnyFunSuite
import com.data.practice.TDDPracticeScalaApp

class TestUsingAnyFunSuite extends AnyFunSuite {

  val practiceApp = new TDDPracticeScalaApp

  test("checkNumberInRange should return false if number is negative") {
    assert(practiceApp.checkNumberInRange(Some(-5)) ==  Some(false))
  }

  test("checkNumberInRange should return false if number is greater than 10") {
    assert(practiceApp.checkNumberInRange(Some(11)) == Some(false))
  }

  test("checkNumberInRange should return false if null is passed") {
    assert(practiceApp.checkNumberInRange(null) == Some(false))
  }

  test("checkNumberInRange should return true if number is 0") {
    assert(practiceApp.checkNumberInRange(Some(0)) == Some(true))
  }

  test("checkNumberInRange should return true if number is 10") {
    assert(practiceApp.checkNumberInRange(Some(10)) == Some(true))
  }

  test("checkNumberInRange should return true if number is between 0 and 10") {
    assert(practiceApp.checkNumberInRange(Some(6)) == Some(true))
  }

}
