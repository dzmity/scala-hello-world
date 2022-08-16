package lesson6

class Test_inner_methods {
  def sumSqr(a: Int, b: Int) : Int = {
    //  all arguments are val variables
    //  impossible
    //  a = a +1
    def sqr(x: Int): Int = x * x
    sqr(a) + sqr(b)
  }
}
