object Meeting {
  def meeting(s: String): String = s.toUpperCase.split(";").map(x => (x.split(":"))).sortWith((x,y) => (x.last < y.last || x.last == y.last && x.head < y.head )) .map(x => "(" + x.last + ", " + x.head + ")").mkString
}