class MyInt(val value: Int) extends AnyVal {
  override def toString = s"MyInt($value)"

  def add(other: MyInt): MyInt = new MyInt(value + other.value)

  def subtract(other: MyInt): MyInt = new MyInt(value - other.value)

  def multiply(other: MyInt): MyInt = new MyInt(value * other.value)

  def divide(other: MyInt): MyInt = new MyInt(value / other.value)

  def +(other: MyInt): MyInt = new MyInt(value + other.value)

  def -(other: MyInt): MyInt = new MyInt(value - other.value)

  def *(other: MyInt): MyInt = new MyInt(value * other.value)

  def /(other: MyInt): MyInt = new MyInt(value / other.value)

  def ++(other: MyInt): MyInt = new MyInt(s"$value${other.value}".toInt)
  def ++:(other: MyInt): MyInt = new MyInt(s"$value${other.value}".toInt)
}

val a = new MyInt(10)
val b = new MyInt(20)
val c = new MyInt(2)


a add b multiply c  // 60
10 + 20 * 2
a + b * c // 50

a subtract b divide c // -5
10 - 20 / 2 // 0

// Приоритет операторов скала определяется первым символом в их имени


// Accoциативность операторов (почти все операторы лево-ассоциативные)
// т.е. при равенстве приоритета операторов первым выполняется тот, что слева
a + b - c  // 10 + 20 - 2 == 28
(a.+(b)).-(c)

// Если название оператора заканчивается на двоеточие (:) - то он право-ассоциативный

a ++ b // 1020
a ++: b // == b ++ a  2010

a ++ b ++ c // 10202
a ++: b ++: c // 22010
(c.++:(b)).++:(a)

// :: - add to head of the list
1 :: 2 :: 3 :: Nil

val list = Nil.::(3).::(2).::(1)

// :+ - add to end of the list

val list2 = list :+ 4

0 +: list2

0 +: list :+ 4
// the same as
list.+:(0).:+(4)



