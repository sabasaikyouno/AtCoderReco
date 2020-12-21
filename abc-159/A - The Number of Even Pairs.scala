import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n, m = sc.nextInt()
  val l = ((1 to n * 2).filter(_ % 2 == 0) ++ (1 to m * 2).filter(_ % 2 != 0)).combinations(2).count(_.sum % 2 ==0)

  println(l)

}
