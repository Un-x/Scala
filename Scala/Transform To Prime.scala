object TransformToPrime {
  def minimumNumber(numbers: Seq[Int]): Int = {
    val total = numbers.sum
    var prime = total
    while(!(isPrime(prime))){
      prime=prime+1
    }
    prime-total
  }
  def isPrime(x: Int): Boolean = {
    if(x <= 1) false
    else if(x == 2) true
    else !(2 to (x-1)).exists(y => (x % y == 0))
  }
}