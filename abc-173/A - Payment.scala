import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt

  while(n > 1000) n -= 1000
  if(n == 0) println(n) else println(1000 - n)
  
}
