import java.util.Scanner
 
object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  val t = sc.next().dropRight(1)
  println{if(s==t) "Yes" else "No"}
}
