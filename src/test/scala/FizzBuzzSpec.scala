import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzSpec extends FlatSpec with Matchers {
  it should "fizz for multiples of three" in {
    val fizzbuzz = new FizzBuzz()
    fizzbuzz.play(3) shouldBe "Fizz"
    fizzbuzz.play(6) shouldBe "Fizz"
  }

  it should "buzz for multiples of five" in {
    val fizzbuzz = new FizzBuzz()
    fizzbuzz.play(5) shouldBe "Buzz"
    fizzbuzz.play(10) shouldBe "Buzz"
  }

  it should "fizzbuzz for multiples of fifteen" in {
    val fizzbuzz = new FizzBuzz()
    fizzbuzz.play(15) shouldBe "FizzBuzz"
    fizzbuzz.play(30) shouldBe "FizzBuzz"
  }

  it should "pass the number through (as a string) otherwise" in {
    val fizzbuzz = new FizzBuzz()
    fizzbuzz.play(1) shouldBe "1"
    fizzbuzz.play(7) shouldBe "7"
    fizzbuzz.play(28) shouldBe "28"
  }
}
