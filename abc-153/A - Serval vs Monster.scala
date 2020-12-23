import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val ans = math.ceil(sc.nextDouble()/sc.nextDouble()).toInt
  println(ans)
}
