import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  println(if(s.last == 's') s"${s}es" else s"${s}s")

}
