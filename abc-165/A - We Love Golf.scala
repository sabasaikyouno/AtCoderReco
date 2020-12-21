import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val k, a, b = sc.nextInt()
  var ans = (a to b).filter(n => n % k == 0).length
  println{if(ans == 0) "NG" else "OK"}
}
