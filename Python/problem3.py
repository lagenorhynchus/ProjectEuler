def largest_prime_factor(n):
    prime_factors = []
    divisor = 2
    while divisor <= n:
        if n % divisor == 0:
            prime_factors.append(divisor)
            n //= divisor
        else:
            divisor += 1
    return prime_factors[-1]


if __name__ == '__main__':
    print(largest_prime_factor(600851475143))
