object Problem2 {
  def sumEvenFibonacciNumbers(m: BigInt): BigInt = {
    lazy val evenFibs: Stream[BigInt] =
      2 #:: 8 #:: evenFibs.zip(evenFibs.tail).map(t => t._1 + 4 * t._2)
    evenFibs.takeWhile(_ <= m).sum
  }

  def main(args: Array[String]): Unit =
    println(sumEvenFibonacciNumbers(4000000))
}
