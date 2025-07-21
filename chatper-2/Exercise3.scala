object Exercise3 {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  def integerAddition(a: Int, b: Int) : Int =
    a + b

  def stringAddition(a: String, b: String): String =
    a + b

  def main(args: Array[String]) : Unit = {
    val curried = curry(integerAddition)(4)
    println(curried(6))
    val stringCurried = curry(stringAddition)("Hello ")
    println(stringCurried(" World!"))
  }
}