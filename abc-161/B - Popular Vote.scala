import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n, m = sc.nextInt()
  val a = Seq.fill(n)(sc.nextInt())
  val ans = m <= a.count(i => i >= (a.sum + 4 * m - 1) / (4*m))

  println(if(ans) "Yes" else "No")

}
