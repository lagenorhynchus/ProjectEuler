object Problem1_3 {
  def sumMultiples(a: BigInt)(b: BigInt)(end: BigInt): BigInt = {
    def calc(m: BigInt) = {
      val n = (end - 1) / m
      m * n * (n + 1) / 2
    }
    calc(a) + calc(b) - calc(a * b / (a gcd b))
  }

  def main(args: Array[String]): Unit =
    println(sumMultiples(3)(5)(1000))
}
