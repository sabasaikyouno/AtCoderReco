import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  val ans = s.contains('A') && s.contains('B')
  println(if (ans) "Yes" else "No")
}
