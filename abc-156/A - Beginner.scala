import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n, r = sc.nextInt()

  println(if(n < 10) r + 100 * (10-n) else r)

}
