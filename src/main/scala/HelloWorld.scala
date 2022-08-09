import scala.io.StdIn

object HelloWorld extends App {

  val name = StdIn.readLine("Enter your name: ")
  println(s"Hello $name!")
}
