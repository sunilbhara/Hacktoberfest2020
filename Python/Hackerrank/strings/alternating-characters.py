# https://www.hackerrank.com/challenges/alternating-characters
#!/bin/python


def alternatingCharacters(s):
    count = 0
    for index, i in enumerate(s):
        try:
            if s[index] == s[index + 1]:
                count += 1
        except:
            return count

q = int(raw_input().strip())
for a0 in xrange(q):
    s = raw_input().strip()
    result = alternatingCharacters(s)
    print(result)
