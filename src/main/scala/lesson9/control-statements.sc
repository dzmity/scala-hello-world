import scala.util.Random
// if , for , try, match возвращают значения

// императивный подход с сайд эффектом

var result = 0
if (Random.nextBoolean()) {
  println(1)
  result = 1
} else {
  println(2)
  result = 2
}

// функциональный стиль
// при выводе типа выбирается ближайший общий предок
val result = if (Random.nextBoolean()) 1 else true

// type AnyVal
val result = if (Random.nextBoolean()) 1

