package example

object HigherOrderFunctions {


  //Funktion als Parameter
  def math(f: (Int, Int) => Int, x: Int, y: Int) : Int = f(x, y)

  def add = (x: Int, y: Int) => (x + y)
  def substract = (x: Int, y: Int) => (x - y)
  def multiply  = (x: Int, y: Int) => (x * y)
  def divide = (x: Int, y: Int) => (x / y)


//  Funktion als Rückgabewert
  def malX(x: Int) : Int => Int = { y => y * x }

  val mal_drei = malX(3)


  def main(args: Array[String]): Unit = {

    println("math(add, 15, 3) = " + math(add, 15, 3)) //add(15, 3)
    println("math(substract, 15, 3) = " + math(substract, 15, 3))
    println("math(multiply, 15, 3) = " + math(multiply, 15, 3))
    println("math(divide, 15, 3) = " + math(divide, 15, 3))


    println("mal_drei(5) = " + mal_drei(7) + "\n")

  }

}
