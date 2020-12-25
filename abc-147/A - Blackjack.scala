import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val ans = Seq.fill(3)(sc.nextInt()).sum >= 22
  
  println(if(ans) "bust" else "win")
  
}
