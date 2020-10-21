def hcf(a,b):
    if a == 0:
        return b
    else:
        return hcf(b%a,a)

if __name__ == '__main__':
    a = list(map(int,input().split()))
    result = hcf(a[0],a[1])
    print(result)




