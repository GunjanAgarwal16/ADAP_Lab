object Set1 {
  def main(args: Array[String]) = {
    val names = Set("gunjan", "rudra", "jyoti", "hemant")
    val nums: Set[Int] = Set()

    println("Head of names:" + names.head)
    println("Tail of names:" + names.tail)
    println("Check if names is empty: " + names.isEmpty)
    println("Check if nums is empty: " + nums.isEmpty)
  }

}
