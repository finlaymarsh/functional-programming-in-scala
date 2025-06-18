import scala.annotation.tailrec

object ExampleModule { // Declares a singleton object
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def factorial(n: Int): Int = {
    @tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)
    go(n, 1)
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d" // capable of type inference
    msg.format(x, abs(x))
  }

  def formatFactorial(x: Int): String = {
    val msg = "The factorial value for %d is %d" // capable of type inference
    msg.format(x, factorial(x))
  }
  def main(args: Array[String]): Unit = { // Unit serves the same purpose as void in Java
    println(formatAbs(-42))
    println(formatFactorial(6))
  }
}

// Can be compiled using command `scalac example.scala`
// Can be ran using command `scala ExampleModule`