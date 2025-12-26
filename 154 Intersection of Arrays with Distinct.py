a = [20, 10, 30, 50, 40]
b = [15, 25, 30, 20, 35]

res = 0

for el in a:
    if el in b:
        res += 1

print(res)

b_set = set(b)
res = 0
for el in a:
    if el in b_set:
        res += 1

print(res)
