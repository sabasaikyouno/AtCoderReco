import java.util.Scanner
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var a, b = sc.nextInt()
  val t = Seq.fill(a, a)(sc.nextInt())
  val per = Seq.range(2,a+1).permutations.toSeq
  var ans = Seq[Int]()
  var k = 0
  var count = 0
  for(c <- 0 to per.length - 1){
 
    for(i <- 0 to a-2){
      if(i == 0){
        k = t(0)(per(c)(0)-1)
        k = k + t(per(c).last-1)(0)
      }else{
        k = k + t(per(c)(count)-1)(per(c)(count+1)-1)
        count = count + 1
      }
    }
    if(k == b){
      ans = ans :+ k
    }
 
    k = 0
    count = 0
  }
 
 
  println(ans.length)
 
}
