import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  
  println(if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)) "Yes" else "No")
  
}
