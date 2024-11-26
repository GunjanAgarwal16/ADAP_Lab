object Reverse {
  def main(args: Array[String]) = {
    val f = "apples" :: ("oranges" :: ("pears" :: Nil))

    println("Before reverse: " + f)
    println("after reverse: " + f.reverse)
  }
}
