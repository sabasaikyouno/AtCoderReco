import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var a, b, c, k = sc.nextInt()
  if(a >= k) println(1*k)
  else{
    var ans = 1 * a
    k = if(k-a <= 0) 0 else k-a
    k = if(k-b <= 0) 0 else k-b
    ans += k * -1
    println(ans)
  }

}
