import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.next()
  var ans = 0
  for(x <- 0 to n.length-1){
   ans += n(x).asDigit
  }
  println(if(ans%9==0) "Yes" else "No")

}
