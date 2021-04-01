
//Beispiel 1
val list =
  for (x <- 10 to 12)
  yield x * 2

//Übersetzung vom Compiler
val list = (10 to 12).map(x => x * 2)


//Beispiel 2
def isMultipleOfFour(a: Int)= a % 4 == 0

val list1 = for {
  i <- 1 to 10
  j <- 1 to 10
  if isMultipleOfFour(i+j)
} yield (i,j)

//Übersetzung vom Compiler
val list2 = (1 to 10).flatMap( i =>
  (1 to 10) filter (j => isMultipleOfFour(i + j))
    map (j => (i,j))
)



