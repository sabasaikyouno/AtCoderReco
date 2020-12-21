import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val sx, sy, gx, gy = sc.nextDouble()
  println((sx*gy+gx*sy)/(sy+gy))

}
