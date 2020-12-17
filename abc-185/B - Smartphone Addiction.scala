import java.util.Scanner
 
 
object Main extends App {
  val sc = new Scanner(System.in)
  var n = sc.nextInt()
  val m = sc.nextInt()
  val t = sc.nextInt()
  val ab = Seq.fill(m*2)(sc.nextInt())
  var hiki = Seq(n,ab(0))
  var n2 = n
  var ans = true
 
  for(x <- 0 to m*2-2){
    hiki = hiki :+ (ab(x) - ab(x+1)).abs
  }
 
  hiki = hiki :+ (ab.last - t).abs
 
  for(i <- 0 to hiki.length-2){
    if(i % 2 == 0){
 
      if(hiki(i) - hiki(i+1) > 0 || n2 - hiki(i+1) > 0){
        n2 = n2 - hiki(i+1)
      }else{
        ans = false
      }
    }else{
      if(n2 + hiki(i+1) >= n) n2 = n else n2 = n2 + hiki(i+1)
    }
  }
 
  println(if(ans) "Yes" else "No")
 
}
