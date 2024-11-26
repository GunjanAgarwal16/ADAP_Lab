object ConcatScala {
  def main(args: Array[String]) = {
    val n1 = Set("gunjan", "rudra")
    val n2 = Set("hemant", "jyoti")

    var n = n1 ++ n2
    println("n1++n2" + n)

    n = n1.++(n2)
    println("n1.++n2" + n)

  }

}
