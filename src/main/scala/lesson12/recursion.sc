// it is required to specify return type (BigInt) for recursion
// compiler could not define it
def factorial(n: Int): BigInt = {
  assert(n >= 0, "should be positive")
  assert(n < 50000, "too big value")

  def f(n: Int): BigInt = {
    if (n > 0) n * factorial(n - 1)
    else 1
  }

  f(n)
}


factorial(2)  // 2
// factorial(30000) // StackOverflowError

// should use TAIL RECURSION
// RESTRICTION: method with tail recursion should have in the last statement
// return VALUE or INVOCATION OF THIS METHOD


def factorial(n: Int): BigInt = {
  assert(n >= 0, "should be positive")
  assert(n < 50000, "too big value")

  def functionWithTailRecursion(n: Int, acc: BigInt = 1): BigInt = {
    if (n > 0) functionWithTailRecursion(n - 1, acc * n)
    else acc
  }

  functionWithTailRecursion(n)
}

factorial(30000) // StackOverflowError


def factorialByCollection(n: Int): BigInt = {
  assert(n >= 0, "should be positive")
  assert(n < 50000, "too big value")
  if (n == 0) 1
//  else (1 to n).foldLeft(BigInt.int2bigInt(1)) ((accumulator, value) => accumulator * value)
//  else (1 to n).foldLeft(BigInt.int2bigInt(1)) {(accumulator, value) => accumulator * value}
//  else (1 to n).foldLeft(BigInt.int2bigInt(1)) { _ * _}
//  else (BigInt(1) to BigInt(n)).reduce( _ * _)
  else (BigInt(1) to BigInt(n)).product
}


factorialByCollection(5)