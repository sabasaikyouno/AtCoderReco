import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a = Seq.fill(9)(sc.nextInt())
  val b = Seq.fill(sc.nextInt())(sc.nextInt())

  val ans = {
    if(b.contains(a(0)) && b.contains(a(1)) && b.contains(a(2))||
      b.contains(a(3)) && b.contains(a(4)) && b.contains(a(5))||
      b.contains(a(6)) && b.contains(a(7)) && b.contains(a(8))||
      b.contains(a(0)) && b.contains(a(3)) && b.contains(a(6))||
      b.contains(a(1)) && b.contains(a(4)) && b.contains(a(7))||
      b.contains(a(2)) && b.contains(a(5)) && b.contains(a(8))||
      b.contains(a(0)) && b.contains(a(4)) && b.contains(a(8))||
      b.contains(a(2)) && b.contains(a(4)) && b.contains(a(6))) true
    else false
  }

  println(if(ans) "Yes" else "No")



}
