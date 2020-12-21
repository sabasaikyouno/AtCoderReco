import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val x = sc.nextLong()
  val a = x / 500
  val b = x % 500 / 5

  println(a*1000+b*5)

}
