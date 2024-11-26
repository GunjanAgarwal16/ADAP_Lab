object Demo6 {
  def main(args: Array[String]) = {
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    for (x <- myList) {
      println(x)
    }

    var total = 0.0
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("Total is:" + total)
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i)
    }
    println("Max is: " + max)

  }
}

//multidimensional array
//var myMatrix = ofDim[Int](3, 3)
import Array._

object Demo7 {
  def main(args: Array[String]) = {
    var myMatrix = ofDim[Int](3, 3)

    // building a matrix
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        myMatrix(i)(j) = j;
      }
    }

    // printing
    for (i <- 0 to 2) {
      for (j <- 0 to 2) {
        print(" " + myMatrix(i)(j));

      }
      println();
    }
  }
}

//conactenate arrays
import Array._
object Demo8 {
  def main(args: Array[String]) = {
    var myList1 = Array(1, 2, 3, 4)
    var myList2 = Array(5, 6, 7, 8)
    var myList3 = concat(myList1, myList2)
    for (x <- myList3) {
      println(x)
    }
  }

}

import Array._
object Demo9 {
  def main(args: Array[String]) = {
    var myList1 = range(10, 20, 2)
    var myList2 = range(10, 20)

    for (x <- myList1) {
      print(" " + x)

    }
    println()
    for (x <- myList2) {
      print(" " + x)
    }
  }
}
