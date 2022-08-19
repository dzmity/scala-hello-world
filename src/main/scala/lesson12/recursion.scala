package lesson12

import scala.annotation.tailrec

object recursion extends App {

  def factorial(n: Int): BigInt = {
    assert(n >= 0, "should be positive")
    assert(n < 50000, "too big value")

    @tailrec
    def functionWithTailRecursion(n: Int, acc: BigInt = 1): BigInt = {
      if (n > 0) functionWithTailRecursion(n - 1, acc * n)
      else acc
    }

    functionWithTailRecursion(n)
  }


  factorial(1000)
}
