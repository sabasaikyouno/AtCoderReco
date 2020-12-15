import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  println(if(n%2==0) "White" else "Black")

}
