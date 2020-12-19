import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val x, y = sc.nextInt()
  var b = (Seq.fill(x)(2)++Seq.fill(x)(4)).combinations(x).exists(_.sum==y)

  println(if(b) "Yes" else "No")

}
