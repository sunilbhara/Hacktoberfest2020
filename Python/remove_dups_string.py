x = input()
y = {}
z = ""
for i in range len(x):
  if not y.get(x[i]):
   y[x[i]] = True
   z += x[i]
return z
