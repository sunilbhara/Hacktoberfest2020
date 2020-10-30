input S 
reverse S 
for i = 1 to length of S 
     if S[i] = 'A' then S'[i] = 'T'
     if S[i] = 'T' then S'[i] = 'A'
     if S[i] = 'C' then S'[i] = 'G'
     if S[i] = 'G' then S'[i] = 'C'

print S'
