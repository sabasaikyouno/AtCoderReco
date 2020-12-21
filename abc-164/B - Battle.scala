import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var a, b, c, d = sc.nextInt()

  while(a > 0 && c > 0){
    c = c - b
    if(c > 0){
      a = a - d
    }
  }
  
  println(if(a > 0) "Yes" else "No")

}
