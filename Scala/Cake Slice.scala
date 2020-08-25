object Kata {
  def cakeSlice(n: Int): Int = {
    if(n == 0) 1
    else (n + cakeSlice(n-1))
  }
}