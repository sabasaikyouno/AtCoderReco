import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val n, k = sc.nextInt()
  val p = Seq.fill(n)(sc.nextInt()).sorted.take(k).sum

  println(p)

}
