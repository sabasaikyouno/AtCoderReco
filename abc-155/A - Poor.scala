import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val ans = Seq.fill(3)(sc.nextInt()).distinct.size == 2

  println(if(ans) "Yes" else "No")

}
