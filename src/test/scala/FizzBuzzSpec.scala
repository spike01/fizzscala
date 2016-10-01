import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {
  it should "fizz for multiples of three" in {
    val fizzbuzz = new FizzBuzz()
    assert(fizzbuzz.play(3) === "Fizz")
    assert(fizzbuzz.play(6) === "Fizz")
  }

  it should "buzz for multiples of five" in {
    val fizzbuzz = new FizzBuzz()
    assert(fizzbuzz.play(5) === "Buzz")
    assert(fizzbuzz.play(10) === "Buzz")
  }

  it should "fizzbuzz for multiples of fifteen" in {
    val fizzbuzz = new FizzBuzz()
    assert(fizzbuzz.play(15) === "FizzBuzz")
    assert(fizzbuzz.play(30) === "FizzBuzz")
  }

  it should "pass the number through (as a string) otherwise" in {
    val fizzbuzz = new FizzBuzz()
    assert(fizzbuzz.play(1) === "1")
    assert(fizzbuzz.play(7) === "7")
    assert(fizzbuzz.play(28) === "28")
  }
}
