# https://www.hackerrank.com/challenges/caesar-cipher-1
#!/bin/python
import sys


n = int(raw_input().strip())
s = raw_input().strip()
k = int(raw_input().strip())
k = k % 26

list_string = list(s)

for count, item in enumerate(list_string):
    if item.islower():
        val = ord(item) + k
        if val > ord('z'):
            val = val - 26
        list_string[count] = chr(val)
    elif item.isupper():
        val = ord(item) + k
        if val > ord('Z'):
            val = val - 26
        list_string[count] = chr(val)
    else:
        list_string[count] = item
print ''.join(list_string)
