import java.util.Scanner
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var n, x, t = sc.nextInt()
  var tako = 0
  var ans = 0
  while(n > tako){
    tako += x
    ans += t
  }
 
  println(ans)
 
}
