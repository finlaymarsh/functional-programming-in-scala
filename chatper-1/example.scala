object ExampleModule { // Declares a singleton object
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d" // capable of type inference
    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit = { // Unit serves the same purpose as void in Java
    println(formatAbs(-42))
  }
}

// Can be compiled using command `scalac example.scala`
// Can be ran using command `scala ExampleModule`