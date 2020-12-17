import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  var x = Seq.fill(n)(sc.nextLong().abs)
  var a = 0

  println(x.sum)
  println(Math.sqrt(x.map(i => i * i).sum))
  println(x.max)

}
