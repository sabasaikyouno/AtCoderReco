import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val s = sc.next().map{ x =>
    if((x.toByte + n).toInt > 90){
      ((90-(x.toByte+n)).abs + 64).toByte.toChar
    } else {
      (x.toByte + n).toByte.toChar
    }
  }
  println(s)
}
