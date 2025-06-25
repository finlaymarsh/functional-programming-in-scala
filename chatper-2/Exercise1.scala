object Exercise1 {

  // As this function is pure the compiler can do clever memorization optimisations
  def fib(n: Int) : Int = {
    if (n == 1) 1
    else if (n == 0) 0
    else fib(n - 1) + fib(n - 2)
  }

  def formatResult(name: String, x: Int, f: Int => Int): String = {
    val msg = "The %s value for %d is %d" // capable of type inference
    msg.format(name, x, f(x))
  }

  def main(args: Array[String]) : Unit = {
    println(formatResult("fibonacci", 2, fib))
    println(formatResult("fibonacci", 6, fib))
    println(formatResult("fibonacci", 10, fib))
  }
}