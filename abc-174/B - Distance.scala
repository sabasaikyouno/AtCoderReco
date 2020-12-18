import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val d = sc.nextInt()
  var l = Seq.fill(n)(math.sqrt(math.pow(sc.nextInt(),2) + math.pow(sc.nextInt(),2))).count(_<=d)

  println(l)

}
