s = "aaa"
res = set()

for i in range(len(s)):
    curr = ""
    for j in range(i, len(s)):
        curr += s[j]
        res.add(curr)

print(len(res))
