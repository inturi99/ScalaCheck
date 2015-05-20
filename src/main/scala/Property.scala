object PropertyUtil {
  //Square Function
  def square(n: Int) : Int = n * n
  //concate Function
  def concate(v1: List[Int], v2: List[Int]) = {
    var result = List[Int] ()
    val x1 = for(x <- v1) {
      result = result :+x
    }
    for(y <- v2){
      result = result :+ y
    }
    result
  }
  // reverse List Function
  def reverse(list: List[Int]) = {
    def loop(lst: List[Int], res: List[Int]): List[Int] =
      lst match{
        case Nil => res
        case head :: tail => loop(tail, head :: res)
      }
    loop(list, Nil)
  }
}
