class FizzBuzz() {
  def play(num: Int) = (num % 3, num % 5) match {
    case (0, 0) => "FizzBuzz"
    case (_, 0) => "Buzz"
    case (0, _) => "Fizz"
    case _ => num
  }
}
