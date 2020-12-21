import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var x = sc.nextLong()
  var ans = 0
  var k: Long = 100
  while(k < x){
    k += k/100
    ans += 1
  }
  println(ans)

}
