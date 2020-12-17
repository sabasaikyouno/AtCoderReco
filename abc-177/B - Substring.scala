import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var s, t = sc.next()
  var ans = Seq[Int]()
  var l = s.sliding(t.length).toList
  var c = 0
  for(x <- 0 to l.length - 1){
    for(i <- 0 to t.length-1){
      if(l(x)(i) == t(i)){

      }else{
        c += 1
      }
    }
    ans = ans :+ c
    c = 0
  }
  println(ans.min)
}
