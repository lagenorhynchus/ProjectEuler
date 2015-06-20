from fractions import gcd


class SumMultiples():
    def __init__(self, a, b):
        self.a = a
        self.b = b

    def result(self, end):
        def calc(m):
            n = (end - 1) // m
            return m * n * (n + 1) // 2
        return (calc(self.a) +
                calc(self.b) -
                calc(int(self.a * self.b / gcd(self.a, self.b))))


if __name__ == '__main__':
    sm = SumMultiples(3, 5)
    print(sm.result(1000))
