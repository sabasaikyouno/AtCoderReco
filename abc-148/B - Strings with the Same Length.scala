import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val a = sc.next()
  val b = sc.next()
  val ans = (0 to n-1).flatMap(x => a(x).toString + b(x).toString).mkString("")
  println(ans)
}
