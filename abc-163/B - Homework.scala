import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n, m = sc.nextInt()
  val ans = n - Seq.fill(m)(sc.nextInt()).sum
  
  println(if(ans > -1) ans else -1)

}
