object Mumbling {
  def accum(s: String) = {
    if (s.isEmpty) List()
    else s.toList.zipWithIndex.map(expand).reduce(_ + "-" + _)
  }
  def expand(tuple:(Char,Int)):String = tuple._1.toUpper.toString + (tuple._1.toLower.toString * tuple._2)
}