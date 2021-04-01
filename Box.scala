package example

class Box[T](val cupcakes: List[T]) {

  def map(f:T => T) = cupcakes.map(cupcake => f(cupcake))

  override def toString="BOOOOOX"

}
