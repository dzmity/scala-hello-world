(x: Int) => x * x
(x: Int, y: Int) => x + y

res0(2)
res1(2, 4)

val sqr = (x: Int) => x * x
val sqr1: Int => Int = x => x * x
val sqr2 = new Function1[Int, Int] {
  override def apply(v1: Int) = v1 * v1
}

val add = (x: Int, y: Int) => x + y
val add2: (Int, Int) => Int = _ + _


sqr.isInstanceOf[AnyRef]


add(2, 3)
add.apply(2, 3)

val factorial: (Int => Int) = (n: Int) => if (n == 0) 1 else n * factorial(n - 1)

factorial.apply(4)

val addSqr = (x: Int, y: Int) => add(sqr(x), sqr(y))

// Почему так нельзя?
// val addSqr2: (Int, Int) => Int = add(sqr(_), sqr(_))

val addSqr3: (Int, Int) => Int = (x, y) => {
  val x1 = sqr(x)
  val y1 = sqr(y)
  add(x1, y1)
}

val addSqr4: (Int, Int) => Int = { (x, y) =>
  val x1 = sqr(x)
  val y1 = sqr(y)
  add(x1, y1)
}

val addSqr5 = (x: Int, y: Int) => {
  val x1 = sqr(x)
  val y1 = sqr(y)
  add(x1, y1)
}

val addSqr6 = { (x: Int, y: Int) =>
  val x1 = sqr(x)
  val y1 = sqr(y)
  add(x1, y1)
}

addSqr(2, 3)
addSqr3(2, 3)
addSqr4(2, 3)
addSqr5(2, 3)


