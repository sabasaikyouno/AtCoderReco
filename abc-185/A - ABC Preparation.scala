import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val s = Seq.fill(4)(sc.nextInt())
  println(s.min)
  
}
