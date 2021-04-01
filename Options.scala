package example

import java.util.concurrent.Callable

object Options {

  def toOption(c: Cupcake): Option[Cupcake] = {
    c match {
      case null => None
      case _ => Some(c)
    }
  }


  def main(args: Array[String]): Unit = {

    //Beispiel 1 Single Box - no Option
    println("\n\n------Beispiel 1------")
    val box = List(new Cupcake, new Cupcake, null)
//    for (cupcake <- box) yield cupcake.fill
//
//    for (c <- box) {
//      if (c != null) c.fill
//      else println("cupcake is null")
//    }


    //Beispiel 2 Single Box - Option
    println("\n\n------Beispiel 2------")

    def toOption(c: Cupcake): Option[Cupcake] = {
      c match {
        case null => None
        case _ => Some(c)
      }
    }

    println(s"box initial = $box")
//    val box = List(new Cupcake, new Cupcake, null)

    val boxMap = box.map(toOption)
      // = List(Some(new Cupcake), Some(new Cupcake), None)
    println("box after box.map(toOption) = " + boxMap)

    val boxFlatMap = box.flatMap(toOption)
    println("box after box.flatMap(toOption) = " + boxFlatMap)

    for (cupcake <- boxFlatMap) yield cupcake.fill

    println(s"box after call = $box")
    println(s"boxFlatMap = $boxFlatMap")



    //Beispiel 3 Order - no Option
    println("\n\n------Beispiel 3------")
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

    //Beispiel 4 Order - Option
    println("\n\n------Beispiel 4------")

//    val box1 = List(new Cupcake, new Cupcake, null)
//    val box2 = List(new Cupcake, new Cupcake, new Cupcake)
//    val box3 = null
//    val order = List(box1, box2, box3)

    def toOptionBox (box: List[Cupcake]) : Option[List[Cupcake]] = {
      box match {
        case null => None
        case _ => Some(box)
      }
    }

    def fillAll (order : List[List[Cupcake]]) = {
      val orderFlatMap = order.flatMap(toOptionBox)
      for (box <- orderFlatMap) {
        val boxFlatMap = box.flatMap(toOption)
        for (cupcake <- boxFlatMap) yield cupcake.fill
      }
    }
//
    println(s"order initial = $order")
    val neww = fillAll(order)
    println(s"order after = $order")

  }


}