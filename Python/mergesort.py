import random

def mergesort(x):
    if len(x) < 20:
        return sorted(x)
    r = []
    mid = int(len(x) / 2)
    y = msort4(x[:mid])
    z = msort4(x[mid:])
    i = 0
    j = 0
    while i < len(y) and j < len(z):
        if y[i] > z[j]:
            r.append(z[j])
            j += 1
        else:
            r.append(y[i])
            i += 1
    r += y[i:]
    r += z[j:]
    return r

rnd = [random.randint(0, 50) for _ in range(10)]
print('Unsorted array:', rnd)
print('Sorted array: ', mergesort(rnd))
