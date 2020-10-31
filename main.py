# generate a password with length "passlen" with no duplicate characters in the password

import random

s = "2345678hg"
passlen = 8
p = "".join(random.sample(s,passlen))
print(p)

