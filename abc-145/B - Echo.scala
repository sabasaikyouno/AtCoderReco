import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val s = sc.next()
  println(if(s.take(n/2) == s.takeRight(n/2)&&n%2==0) "Yes" else "No")
}
