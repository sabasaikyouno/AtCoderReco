import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = Seq.fill(sc.next().size)("x").foldLeft("")(_+_)

  println(s)

}
