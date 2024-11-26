object Demo2 {
  def main(args: Array[String]) = {
    var a = 10
    var b = 20
    var c = 0

    c = a + b;
    println("c=a+b:" + c)

    c += a
    println("c+=a:" + c)
    c -= a
    println("c-=b:" + c)
  }

}
