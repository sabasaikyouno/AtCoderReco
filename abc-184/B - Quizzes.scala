import java.util.Scanner
 
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  var x = sc.nextInt()
  val s = sc.next()
 
  for(i <- 0 to n-1){
    if(s(i) == 'x' && x != 0){
      x = x - 1
    }else if(s(i) == 'o'){
      x = x + 1
    }
  }
 
  println(x)
 
}
