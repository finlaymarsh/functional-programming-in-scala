object Exercise1 {

  // As this function is pure the
  def fib(n: Int) : Int = {
    if (n == 1) 1
    else if (n == 0) 0
    else fib(n - 1) + fib(n - 2)
  }

  def formatFib(x: Int): String = {
    val msg = "The fib value for %d is %d" // capable of type inference
    msg.format(x, fib(x))
  }

  def main(args: Array[String]) : Unit = {
    println(formatFib(2))
    println(formatFib(6))
    println(formatFib(10))
  }
}