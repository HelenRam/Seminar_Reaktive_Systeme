package example

object Main2 {
  //  val ages = Seq(42, 61, 29, 64)
  //  println(s"The oldest person is ${ages.max}")
  //  val x = 1
  //  var y = 1
  //  y = y+1
  //  println(x)

  val pig1 = new Example()

  //insert liefert hier eine neue Instanz von einem Schwein mit 4 coins
  val pig2 = pig1.insert(4)
  //  println(pig2.butcher)
  //  println(pig1.butcher)

  //  val nums: List[Int] = List(4, 9, 1, 3)
  //  //Funktion als Parameter
  //  def smaller(x: Int, y:Int) = x > y
  //  println(nums.sortWith(smaller))
  //  println(nums)

  //Beispiel 1:
  def sayHello(f: () => Unit): Unit = f()

  def helloJoe(): Unit = println("Hello, Joe")
  def hiJoe(): Unit = println("Hi, Joe")
  def bonjourNadine(): Unit = println("Bonjour, Nadine")


  //Beispiel 2:
  def twice(f: Int => Int): Int => Int = { x => f(f(x))}

  def addTwo(a: Int) = a + 2

  val myFunction = twice(addTwo)

  //Beispiel 3: Funktion als Rückgabewert
  def malX(x: Int) : Int => Int = { y => x*y }

  val mal_drei = malX(3)
  val mal_sechs = malX(6)

  //Beispiel 4: Funktion als Parameter
  var v : Int = 0
  def inc() : Int = {v = v+3; v}
  def f(x: Int) : Int = x+x

  //Beispiel 5: map
  val numbers = Seq(1, 2, 3, 4, 5)


  def consumeAllAssumeNoneWithFor(box:Box[Option[Cupcake]]) = {
    for (cupcakes <- box.cupcakes) yield cupcakes match {
      case Some(b) => b.fill
      case None => println("Found None")
    }
  }

  def main(args: Array[String]): Unit = {
    //println("twice(addTwo(4)) = " + twice(4, addTwo))
    //    sayHello(bonjourNadine)
    //    val addFour = addTwo(4)
    //    println(myFunction(5))
    //    println("mal_drei(5) = " + mal_drei(5))
    //    println(mal_sechs(8))
    //    println(f(inc))
    //    println(f(inc))
    //    println(f(inc)
    //   println(numbers.map(addTwo))


    //    def toOption(c: Cupcake): Option[Cupcake] = {
    //      try {
    //        Some(c.fill)
    //      } catch {
    //        case e: Exception => None
    //      }
    //    }


    val box1_1 = List(Some(new Cupcake), Some(new Cupcake), None, Some(new Cupcake))

    //consumeAllAssumeNoneWithFor(box4)

    val box1 = List(new Cupcake, new Cupcake, null)
    val box2 = List(new Cupcake, new Cupcake, new Cupcake)
    val box3 = null

    val order = List(box1, box2, box3)
    //    for (box <- order) {
    //      if (box != null) {
    //        for (cupcake <- box) {
    //          if (cupcake != null) cupcake.fill
    //          else println("cupcake was null")
    //        }
    //      } else println("box was null")
    //    }

    def toOptionBox (b: List[Cupcake]) : Option[List[Cupcake]] = {
      b match {
        case null => None
        case _ => Some(b)
      }
    }




    def toOption(c: Cupcake): Option[Cupcake] = {
      c match {
        case null => None
        case _ => Some(c)
      }
    }

    val box = List(new Cupcake, new Cupcake, null)
    println(box)
    val boxFlatMap = box.flatMap(toOption)
    for (c <- boxFlatMap) yield c.fill

    println(box)
    println(boxFlatMap)


    //    println(box4)
    //    println(box1.map(toOption))
    //    for (cupcake <- box4) yield cupcake.fill

    //    for (cupcake <- box) yield cupcake.fill
    //    for (c <- box) {
    //      if (c != null) c.fill
    //      else println("cupcake is null")
    //    }
  }
}
