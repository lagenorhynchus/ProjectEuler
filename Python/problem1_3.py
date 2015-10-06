from fractions import gcd


def sum_multiples(a, b, end):
    def calc(m):
        n = (end - 1) // m
        return m * n * (n + 1) // 2
    return calc(a) + calc(b) - calc(a * b // gcd(a, b))


if __name__ == '__main__':
    print(sum_multiples(3, 5, 1000))
