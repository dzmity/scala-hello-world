import java.time.{DayOfWeek, LocalDateTime}

1.isInstanceOf[Any]
"".isInstanceOf[Any]
class MyClass
val c = new MyClass
c.isInstanceOf[Any]
c.isInstanceOf[AnyRef]
"".isInstanceOf[AnyRef]

val v1: String = null
val v2: AnyRef =  null
// val v3: AnyVal =  null error

// nothing example
def error(message: String): Nothing =
  throw new IllegalArgumentException(message)

def dayOfWeek: DayOfWeek = {
  val dayOfWeek = LocalDateTime.now.getDayOfWeek
  dayOfWeek match {
    case DayOfWeek.MONDAY => error("Oh no. It is Monday")
    case day => day
  }
}

def dayOfWeekNumber: Int = {
  val dayOfWeek = LocalDateTime.now.getDayOfWeek
  dayOfWeek match {
    case DayOfWeek.MONDAY => error("Oh no. It is Monday")
    case day => day.getValue
  }
}

val throwNotImplementedError = ???

def sum(a: Int, b: Int) : Int = ???

