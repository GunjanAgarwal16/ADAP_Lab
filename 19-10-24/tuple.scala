object MyTuple {
  def main(args: Array[String]) = {
    val t = (4, 3, 2, 1)
    val sum = t._1 + t._2 + t._3 + t._4
    println("\n Printing the sums")
    println("sum of elements: " + sum)

    println("\nIterate over Tuple")
    t.productIterator.foreach { i => println("value=" + i) }

  }
}
