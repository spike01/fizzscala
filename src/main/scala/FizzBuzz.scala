class FizzBuzz() {
  def play(num: Int): String = num match {
    case num if isDivisibleBy(15, num) => "FizzBuzz"
    case num if isDivisibleBy(5, num) => "Buzz"
    case num if isDivisibleBy(3, num) => "Fizz"
    case _ => num.toString()
  }

  def isDivisibleBy(div: Int, num: Int) = num % div == 0
}
