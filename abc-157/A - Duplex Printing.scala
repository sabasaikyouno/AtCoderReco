import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextDouble()

  println(math.ceil(n/2).toInt)

}
