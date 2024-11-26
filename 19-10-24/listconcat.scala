object Concatenate {
  def main(args: Array[String]) = {
    val f1 = "apples" :: ("oranges" :: ("pears" :: Nil))
    val f2 = "mangoes" :: ("banana" :: Nil)

    // these are three methods to conactenate lost in scala
    var f = f1 ::: f2
    println("f1:::f2 : " + f)
    f = f1.:::(f2)
    println("f1.:::(f2) :" + f)
    f = List.concat(f1, f2)
    println("List.concat(f1,f2) : " + f)
  }
}
