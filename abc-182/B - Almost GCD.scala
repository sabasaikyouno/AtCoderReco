import java.util.Scanner

object Main extends App {
  val sc = new Scanner(System.in)
  var s = sc.nextInt
  var a = Seq(sc.nextInt)
  for(x <- 1 to s - 1){
    a = a :+ sc.nextInt
  }
  var i = 0
  var n = 0
  var an = 0

  for(i2 <- 2 to a.max){
    for(x <- 0 to s -1){
      if(a(x) % i2 == 0) {
        i = i + 1
      }

      if(i >= n){
        n = i
        an = i2
      }
    }
    i = 0
  }

  println(an)
  
}
