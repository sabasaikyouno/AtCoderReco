import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt()
  val ans = (1 to 3).filter(x => x!=a&&x!=b)
  println(ans(0))
}
