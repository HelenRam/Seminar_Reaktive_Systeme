package example

import scala.io.StdIn
import scala.util.control.NonFatal
import scala.util.{Failure, Success, Try}

object TryExample {

  def tryToInt(string: String): Try[Int] = Try(string.toInt)
  def tryToFill(cupcake: Cupcake) : Try[Cupcake] = Try(cupcake.fill)


  def main(args: Array[String]): Unit = {
    println(tryToInt("123"))
    println(tryToInt("12.3"))
    println(tryToInt(null))

    println(tryToFill(new Cupcake))
    println(tryToFill(null))
  }
}


