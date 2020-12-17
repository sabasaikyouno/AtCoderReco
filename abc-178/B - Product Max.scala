import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var x = Seq.fill(4)(sc.nextLong())
  var ans = Seq(x(0)*x(2),x(0)*x(3),x(1)*x(2),x(1)*x(3)).max

  println(ans)

}
