object common {
  def main(args: Array[String]) = {
    val n1 = Set(5, 6, 7, 23, 9, 35, 43)
    val n2 = Set(9, 23, 8, 10, 16, 43)
    println("n1.&(n2) : " + n1.&(n2))
    println("n1.intersect(n2): " + n1.intersect(n2))

  }

}
