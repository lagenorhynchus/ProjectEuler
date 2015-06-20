import java.util.function.LongFunction;

public class Problem1_2 {
  public static class SumMultiples {
    private long a;
    private long b;

    public SumMultiples(long a, long b) {
      this.a = a;
      this.b = b;
    }

    public long result(long end) {
      LongFunction<Long> calc = (m) -> {
        long n = (end - 1L) / m;
        return m * n * (n + 1L) / 2L;
      };
      return calc.apply(a) + calc.apply(b) - calc.apply(a * b / gcd(a, b));
    }

    private static long gcd(long x, long y) {
      while (y > 0L) {
        long r = x % y;
        x = y;
        y = r;
      }
      return x;
    }
  }

  public static void main(String[] args) {
    SumMultiples sm = new SumMultiples(3, 5);
    System.out.println(sm.result(1_000L));
  }
}
