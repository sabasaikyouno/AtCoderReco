import java.util.Scanner
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var x = sc.nextInt()
  println(if(x >= 0) x else 0)
}
