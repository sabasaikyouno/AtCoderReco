import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  var l = Seq.fill(n)(sc.next())

  println(s"AC x ${l.count(_=="AC")}\n" +
          s"WA x ${l.count(_=="WA")}\n" +
          s"TLE x ${l.count(_=="TLE")}\n" +
          s"RE x ${l.count(_=="RE")}")

}
