package lesson3

class PrimitiveTypeTest {

  def max(v1: Int, v2: Int) : Int = if (v2 < v1) v1 else v2

  def f(v: Any) : Unit = println(v)

  max(1, 3)

  f(10.1)
}
