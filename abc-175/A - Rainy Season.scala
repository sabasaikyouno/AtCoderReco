import java.util.Scanner


object Main extends App {
  val sc = new Scanner(System.in)
  var s = sc.next()

  if(!s.contains('R')){
    println(0)
  }else if(s(1) == 'R'){
    println(s.filter(_ == 'R').length)
  }else{
    println(1)
  }

}
