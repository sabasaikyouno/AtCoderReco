import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  var ans: Long = 0

  for(i <- 1 to n){
    if(i%3!=0 && i%5!=0){
      ans += i
    }
  }

  println(ans)

}
