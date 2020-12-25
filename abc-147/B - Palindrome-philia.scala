import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  val s2 = s.reverse
  var ans = 0
  for(x <- 0 to s.size - 1){
    if(s(x) != s2(x)) ans += 1
  }
  println(ans/2)
}
