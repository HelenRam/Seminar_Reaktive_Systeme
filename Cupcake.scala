package example

class Cupcake {

  var filled = false

  def fill = {
    println("filling with delicious chocolate cream...")
    filled = true;
    this
  }

  override def toString = if (filled) "filled" else "not filled"
}


