n = hamming = 0
while n <= len(a)-1:
    if a[n] != b[n]:
        hamming += 1
    n += 1
print hamming
