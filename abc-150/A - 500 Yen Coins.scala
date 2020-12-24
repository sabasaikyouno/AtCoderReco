import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val ans = 500 * sc.nextInt() >= sc.nextInt()
  
  println(if(ans) "Yes" else "No")
  
}
