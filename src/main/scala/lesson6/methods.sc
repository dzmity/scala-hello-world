val a = 1

val add: (Int, Int) => Int = (a, b) => a + b
def max(a: Int, b: Int): Int = if (b > a) b else a

add(1, 2)
max(1, 3)

// def meant definition
// (a: Int, b: Int) types for parameters a required
def sumSqr(a: Int, b: Int) : Int = {
//  all arguments are val variables
//  impossible
//  a = a +1
  def sqr(x: Int): Int = x * x
  sqr(a) + sqr(b)
}

sumSqr(2, 3)