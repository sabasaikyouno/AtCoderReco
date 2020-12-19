import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val k = sc.nextInt()
  val s = sc.next()

  println(if(s.length <= k) s else s.take(k)+"...")

}
