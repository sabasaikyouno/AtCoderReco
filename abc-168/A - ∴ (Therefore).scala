import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var x = sc.next().last
  var ans = "hon"

  if(x == '3') ans = "bon" else if(x=='0'||x=='1'||x=='6'||x=='8') ans="pon"
  println(ans)
}
