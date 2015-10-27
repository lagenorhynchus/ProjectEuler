object Problem1 {
  def sumMultiples(m: BigInt, end: BigInt): BigInt = {
    val n = (end - 1) / m
    m * n * (n + 1) / 2
  }

  def sumMultiplesOf3And5(end: BigInt): BigInt =
    sumMultiples(3, end) + sumMultiples(5, end) - sumMultiples(15, end)

  def main(args: Array[String]): Unit =
    println(sumMultiplesOf3And5(1000))
}
