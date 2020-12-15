import java.util.Scanner
 
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var n = Seq.fill(4)(sc.nextInt())
  println(n(0)*n(3)-n(1)*n(2))
 
}
