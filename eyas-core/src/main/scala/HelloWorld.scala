import com.fbart.research.core.Movie

object HelloWorld {
  def main(args: Array[String]): Unit = {
    var movie = new Movie("战狼")
    var str = movie.watch()
    println(str)

    //可变
    var map2 = scala.collection.mutable.Map("Alice" -> 1, "Bob" -> 2)
    map2 += ("Alice2" -> 10,"Zf" -> 66)

    print(map2)
  }
}
