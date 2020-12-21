import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.next().contains('7')
  
  println(if(n) "Yes" else "No")

}
