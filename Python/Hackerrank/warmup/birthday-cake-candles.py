# https://www.hackerrank.com/challenges/birthday-cake-candles

n = int(raw_input().strip())
height = map(int, raw_input().strip().split(' '))
height.sort()
print height.count(max(height))
