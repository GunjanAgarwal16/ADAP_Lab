object MyMap {
  def main(args: Array[String]) = {
    val color1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
    val nums: Map[Int, Int] = Map()
    // basic
    println("\n Basics\n")
    println("Keys in colors: " + color1.keys)
    println("Values in colors: " + color1.values)
    println("Check if colors is empty: " + color1.isEmpty)
    println("Check if nums is empty: " + nums.isEmpty)

    // concatenate map
    println("\nConcatination in maps\n")
    val color2 = Map("blue" -> "0033FF", "yellow" -> "0FFF00")
    var colors = color1 ++ color2
    println("color1++color2: " + colors)

    colors = color1.++(color2)
    println("color1.++(color2): " + colors)

    // print keys and values
    println("\nPrinting keys and values in maps\n")
    color1.keys.foreach { i =>
      print("Key = " + i)
      println(" value = " + color1(i))
    }

    // check for key in map - ifelse
    println("\nif else in maps\n")
    if (color1.contains("red")) {
      println("Red key exists with value: " + color1("red"))
    } else {
      println("Red key does not exist")
    }

    if (color1.contains("maroon")) {
      println("Maroon key exists with value: " + color1("maroon"))
    } else {
      println("Maroon key does not exist")
    }

  }

}
