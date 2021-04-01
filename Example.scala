package example

case class Example (var coins:Int = 0) {

  def insert(newCoins:Int): Example = copy(coins + newCoins)
  def butcher = coins

}



