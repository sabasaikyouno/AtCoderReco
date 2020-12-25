import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt()
  println(if(a<10&&b<10) a*b else -1)
}
