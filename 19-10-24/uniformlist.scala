object Uniform {
  def main(args: Array[String]) = {
    val f = List.fill(3)("apples") // repeat apples three times
    println("fruit: " + f)

    val num = List.fill(10)(2) // repeat the no 2 ten times
    println("num: " + num)
  }
}
