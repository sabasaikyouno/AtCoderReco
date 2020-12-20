import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var n, k = sc.nextInt()
  println(n - Seq.fill(k)(Seq.fill(sc.nextInt())(sc.nextInt())).flatten.distinct.length)
}
