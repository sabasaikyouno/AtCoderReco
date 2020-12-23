import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val m = Seq.fill(2)(sc.next())
  val a, b = sc.nextInt()
  val u = sc.next()
  val ans = m.indexOf(u)

  println(
    if(ans==0) s"${a-1} $b"
    else s"$a ${b-1}"
  )

}
