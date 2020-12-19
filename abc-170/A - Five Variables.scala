import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val x = Seq.fill(5)(sc.nextInt)

  for(i <- 0 to 4){
    if(x(i) != i + 1) println(i + 1)
  }

}
