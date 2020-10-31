# https://www.hackerrank.com/challenges/countingsort1

n = input()
ar = [int(i) for i in raw_input().strip().split()]
for i in xrange(100):
    print ar.count(i),
