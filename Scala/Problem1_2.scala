object Problem1_2 {
  class SumMultiples(val a: BigInt, val b: BigInt) {
    def result(end: BigInt): BigInt = {
      def calc(m: BigInt) = {
        val n = (end - 1) / m
        m * n * (n + 1) / 2
      }
      calc(a) + calc(b) - calc(a * b / (a gcd b))
    }
  }

  def main(args: Array[String]): Unit = {
    val sm = new SumMultiples(3, 5)
    println(sm.result(1000))
  }
}
