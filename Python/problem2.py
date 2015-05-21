def sum_even_fibonacci_numbers(max):
    a, b = 2, 8
    s = 0
    while a <= max:
        s += a
        a, b = b, a + 4 * b
    return s


if __name__ == '__main__':
    print(sum_even_fibonacci_numbers(4000000))
