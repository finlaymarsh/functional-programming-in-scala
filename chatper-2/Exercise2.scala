import scala.annotation.tailrec

object Exercise2 {

  def isSorted[A](as: List[A], ordered: (A, A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean =
      if (n + 1 >= as.length) true
      else if (!ordered(as(n), as(n + 1))) false
      else loop(n + 1)
    loop(0)
  }

  def compareIntsLessThan(a: Int, b: Int): Boolean =
    if (a <= b) true
    else false

  def compareIntsGreaterThan(a: Int, b: Int): Boolean =
    if (a >= b) true
    else false

  def compareSize(a: String, b: String): Boolean =
    if (a.length <= b.length) true
    else false

  def formatResult(isSorted: Boolean): String =
    if (isSorted) "list is sorted"
    else "list is not sorted"

  def main(args: Array[String]) : Unit = {
    println(formatResult(isSorted(List(1, 2, 3), compareIntsLessThan)))
    println(formatResult(isSorted(List(1, 2, 2), compareIntsLessThan)))
    println(formatResult(isSorted(List(1, 3, 2), compareIntsLessThan)))
    println(formatResult(isSorted(List(1, 2, 3), compareIntsGreaterThan)))
    println(formatResult(isSorted(List(1, 3, 2), compareIntsGreaterThan)))
    println(formatResult(isSorted(List(3, 2, 1), compareIntsGreaterThan)))
    println(formatResult(isSorted(List("a", "aa", "aaa"), compareSize)))
    println(formatResult(isSorted(List("aaa", "aa", "a"), compareSize)))
  }
}