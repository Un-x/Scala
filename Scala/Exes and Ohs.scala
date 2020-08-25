object ExesAndOhs {
  def xo(str: String): Boolean = {
    def onlyXO(a: Char) = a match {
      case 'x' => true
      case 'o' => true
      case _ => false
    }
    var a = str.toLowerCase.filter(onlyXO).groupBy(x=>x).mapValues(x=>x.length).values.toList
    a.forall(_ == a.head)
  }
}