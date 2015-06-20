public class Problem1 {
  public static long sumMultiples(long m, long end) {
    long n = (end - 1L) / m;
    return m * n * (n + 1L) / 2L;
  }

  public static long sumMultiplesOf3And5(long end) {
    return sumMultiples(3L, end) + sumMultiples(5L, end) - sumMultiples(15L, end);
  }

  public static void main(String[] args) {
    System.out.println(sumMultiplesOf3And5(1_000L));
  }
}
