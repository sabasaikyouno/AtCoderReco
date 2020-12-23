import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val a, b = sc.nextInt()
  if(a >= b){
    println(Seq.fill(a)(b).foldLeft("")(_+_))
  } else {
    println(Seq.fill(b)(a).foldLeft("")(_+_))
  }

}
