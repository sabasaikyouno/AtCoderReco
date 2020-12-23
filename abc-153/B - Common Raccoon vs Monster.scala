import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val h, n = sc.nextLong()
  val a = Seq.fill(n.toInt)(sc.nextInt()).sum

  println(if(a >= h) "Yes" else "No")

}
