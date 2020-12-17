import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  val n = sc.nextInt()
  var d = Seq.fill(n)((sc.nextInt(),sc.nextInt()))
  var c = 0
  var ans = Seq[Int]()
  for((a,b) <- d){
    if(a == b){
      c += 1
      ans = ans :+ c
    }else{
      ans = ans :+ c
      c = 0
    }
  }

  if(ans.max >= 3) println("Yes") else println("No")

}
