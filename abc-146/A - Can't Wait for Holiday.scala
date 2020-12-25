import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  s match {
    case "SUN" => println(7)
    case "MON" => println(6)
    case "TUE" => println(5)
    case "WED" => println(4)
    case "THU" => println(3)
    case "FRI" => println(2)
    case "SAT" => println(1)
  }
}
