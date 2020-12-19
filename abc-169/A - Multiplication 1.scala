import java.util.Scanner



object Main extends App {
  val sc = new Scanner(System.in)
  val x = Seq.fill(2)(sc.nextInt).product  
  println(x)
}
