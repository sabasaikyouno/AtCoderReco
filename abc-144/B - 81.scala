import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  var ans = false
  for(x <- 1 to 9; i <- 1 to 9){
    if(x*i==n) ans = true
  }
  println(if(ans) "Yes" else "No")
}
