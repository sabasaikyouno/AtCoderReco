import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b, k = sc.nextLong()
  var a1 = a - k
  var b1 = b
  if(k-a > 0) b1 = b - (k - a)

  println(s"${if(a1 < 0) 0 else a1} ${if(b1 < 0) 0 else b1}")

}
