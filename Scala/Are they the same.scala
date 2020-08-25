object Solution {
  def comp(seq1: Seq[Int], seq2: Seq[Int]) : Boolean = {
    if (seq1 == null || seq2 == null) false
    else seq1.sorted.zip(seq2.sorted).forall {
      case (a,b) => a * a == b
      case _ => false
    }
  }
}