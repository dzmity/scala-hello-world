class MyInt(val value: Int) extends AnyVal {
  override def toString = s"MyInt($value)"

  def add(other: MyInt): MyInt = new MyInt(value + other.value)

  def subtract(other: MyInt): MyInt = new MyInt(value - other.value)

  def multiply(other: MyInt): MyInt = new MyInt(value * other.value)

  def divide(other: MyInt): MyInt = new MyInt(value / other.value)
}

val a = new MyInt(10)
val b = new MyInt(20)
val c = new MyInt(2)

1.+(2)
// инфиксная форма того же самого выражения
// 1 + 2

a add b multiply c  //60
// аналогично
a.add(b).multiply(c) //60

10 + 20 *2  // 50



