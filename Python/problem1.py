def sum_multiples(m, end):
    n = (end - 1) // m
    return m * n * (n + 1) // 2


def sum_multiples_of_3_and_5(end):
    return (sum_multiples(3, end) +
            sum_multiples(5, end) -
            sum_multiples(15, end))


if __name__ == '__main__':
    print(sum_multiples_of_3_and_5(1000))
