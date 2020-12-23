import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  val a = Seq.fill(n)(sc.nextInt()).filter(_%2==0).forall(x => x%3==0 || x%5==0)

  println(if(a) "APPROVED" else "DENIED")

}
