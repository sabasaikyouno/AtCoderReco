import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  val ab = Seq.fill(n)((sc.nextLong(),sc.nextLong()))
  var ans: Long = 0
  for((a,b) <- ab) {
    ans += (b * (b+1)) / 2 - ((a-1)*a)/2
  }
  println(ans)
}
