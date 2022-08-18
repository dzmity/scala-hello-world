val range1 = 0 to 10
// with step = 2 to 10 inclusive
val range11 = 0 to(10, 2)
val range2 = 0 until 10
// with step = 2 to 10 exclusive
val range22 = 0 until(10, 2)

// i is un-mutable (val)
for (i <- 0 to 10) {
  println(i)
}

for (i <- Array(1, 2, 3)) println(i)
for (i <- Set(1, 2, 3)) println(i)
for (i <- List(1, 2, 3)) println(i)

// for возвращают значение
val unitResult: Unit = for (i <- List(1, 2, 3)) println(i)

val stillUnitResult = for (i <- List(1, 2, 3)) {
  val element = i * 3
}

// special yield
// type of result container is the same as init container (list)
val listResult: List[Int] = for (i <- List(1, 2, 3)) yield {
  val element = i * 3
  element
}

val listResult2: List[String] = for (i <- List(1, 2, 3)) yield {
  val element = i * 3
  s"$element"
}

// type of result container is the same as init container (set)
val setResult: Set[Int] = for (i <- Set(1, 2, 3)) yield {
  val element = i * 3
  element
}

val setResult2: Set[String] = for (i <- Set(1, 2, 3)) yield {
  val element = i * 3
  s"$element"
}

// simplified
val setResult2Simple = for (i <- Set(1, 2, 3)) yield s"${i * 3}"

// collection1 and collection2 are GENERATORS
val collection1 = List('a', 'b', 'c')
val collection2 = Array(1, 2, 3, 4, 5)

// type of result container is the same as init container (list)
val unitLis: List[Unit] = for (i <- collection1) yield {
  val unitResult: Unit = for (j <- collection2) {
    println(s"$i$j")
  }
  unitResult // unit is returned
}

// type of result container is the same as init container (list)
val listOfArrays: List[Array[String]] = for (i <- collection1) yield {
  // type of result container is the same as init container (array)
  val arrayResult: Array[String] = for (j <- collection2) yield {
    s"$i$j"
  }
  arrayResult // array is returned
}

val listOfArrays: List[Array[String]] = for (i <- collection1) yield {
  // type of result container is the same as init container (array)
  for (j <- collection2) yield s"$i$j" // array is returned
}

listOfArrays.flatten

// in Scala we can write something like the code bellow instead of
/*
  val unitLis: List[Unit] = for (i <- collection1) {
   for (j <- collection2) {
    println(s"$i$j")
  }
}
*/
for (i <- collection1; j <- collection2) println(s"$i$j")

// so we can simplify listOfArrays above
// type of result container is the same as init container (list)
val listOfArrays = for (i <- collection1; j <- collection2) yield {
  // type of result container is the same as init container (array)
  s"$i$j" // String is returned
}

val listOfArrays = for (
  i <- collection1;
  j <- collection2) yield s"$i$j"

// we can change () on {} and remove ;
val listOfArrays = for {
  i <- collection1
  j <- collection2
} yield s"$i$j"

// in for comprehension we can use FILTERS
val listOfArrays = for {
  i <- collection1 if i > 'a' if i < 'c' // only 'b'
  j <- collection2 if j % 2 == 0 // only 2 and 4
} yield s"$i$j"

// in for comprehension we can use VARIABLES between generators
val listOfArrays = for {
  i <- collection1 if i > 'a' if i < 'c' // only 'b'
  // variable temp always VAL
  temp = i.toInt // 98
  j <- collection2 if j % 2 == 0 // only 2 and 4
} yield s"$temp-$j"

