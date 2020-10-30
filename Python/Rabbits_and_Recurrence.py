def fib(n, k):
    previous1, previous2 = 1, 1
    for i in range(2, n):
        previous1, previous2 = previous2, previous1 * k + previous2
    return previous2
