package example

import java.util.function.Predicate

object ImportantHigherOrderFunc {

  def square(x: Int) : Int = x * x
  def isEven (x: Int) = x % 2 == 0
  def add (x: Int, y: Int) = x + y
  def neighbours(x:Int) = List(x-1, x, x+1)

  def main(args: Array[String]): Unit = {
    val numbers = Seq(1, 2, 3, 4, 5)

    //Map
    println("\n numbers before: " + numbers  + "\n")
    println("------ MAP ------")
    println("numbers.map(square)) =  " + numbers.map(square))
    println("numbers.map(x => x*x)) = " + numbers.map(x => x*x) + "\n")

    println("------ FLATTEN ------")
    val numberNeighbours = numbers.map(neighbours)
    println("numberNeighbours = " + numberNeighbours)
    println("numberNeighbours.flatten = " + numberNeighbours.flatten + "\n")

    println("------ FLATMAP ------")
    println("numbers.flatMap(x => neighbours(x)) = " + numbers.flatMap(x => neighbours(x)))
    println("numbers.flatMap(x => List(x-1, x, x+1)) = " + numbers.flatMap(x => List(x-1, x, x+1))  + "\n")


    println("------ FILTER ------")
    println("numbers.filter(isEven) = " + numbers.filter(isEven))
    println("numbers.filter(x => x % 2 == 0) = " + numbers.filter(x => x % 2 == 0)  + "\n")

    //Reduce
    println("------ REDUCE ------")
    println("numbers.reduce(add) = " + numbers.reduce(add))
    println("numbers.reduce((x, y) => x + y) = " + numbers.reduce((x, y) => x + y))

  }

}
