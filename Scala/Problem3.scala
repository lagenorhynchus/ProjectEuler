object Problem3 {
  def largestPrimeFactor(m: BigInt): BigInt = {
    @annotation.tailrec
    def f(n: BigInt, divisor: BigInt, acc: List[BigInt]): List[BigInt] =
      if (divisor > n) acc
      else if (n % divisor == 0) f(n / divisor, divisor, divisor :: acc)
      else f(n, divisor + 1, acc)
    def primeFactors(n: BigInt): List[BigInt] = f(n, 2, Nil)
    primeFactors(m).head
  }

  def main(args: Array[String]): Unit =
    println(largestPrimeFactor(600851475143L))
}
