def sum_even_fibonacci_numbers(max):
    a, b = 2, 8
    s = 0
    while True:
        if a > max:
            return s
        s += a
        a, b = b, a + 4 * b


if __name__ == '__main__':
    print(sum_even_fibonacci_numbers(4000000))
