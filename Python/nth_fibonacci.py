import math

def fibonacci(n):

    s5 = math.sqrt(5.0)
    phi = (1.0 + s5) / 2.0

    left = math.pow(phi, n)
    right = math.pow(1.0-phi, n)

    print ((left - right) / s5);

fibonacci(15)