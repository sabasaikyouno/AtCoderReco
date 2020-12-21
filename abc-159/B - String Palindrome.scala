import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  val s = sc.next()
  val s1 = s == s.reverse
  val s2 = s.take((s.size-1)/2) == s.take((s.size-1)/2).reverse
  val s3 = s.drop(((s.size+3)/2)-1) == s.drop(((s.size+3)/2)-1).reverse
  
  println(if(s1 && s2 && s3) "Yes" else "No")

}
