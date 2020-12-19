import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val a = Seq.fill(n)(BigInt(sc.nextLong()))

  def ans(): BigInt = {
    if(a.contains(0)) return BigInt(0)
    else {
      a.foldLeft(BigInt(1)) {(A, B) =>
        var k = A * B
        if(k > math.pow(10,18).toLong) return BigInt(-1)
        else k
      }
    }
  }

  println(ans())

}
