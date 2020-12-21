import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var s, w = sc.nextInt()
  println(if(s<=w) "unsafe" else "safe")
}
