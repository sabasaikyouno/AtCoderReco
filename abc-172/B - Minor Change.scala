import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val s, t = sc.next()

  println(s.zip(t).count{case (a,b) => a != b})

}
