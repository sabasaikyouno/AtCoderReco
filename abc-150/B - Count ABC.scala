import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  var cnt = 0
  val s = sc.next().sliding(3).foreach{x => if(x == "ABC") cnt += 1 }

  println(cnt)

}
