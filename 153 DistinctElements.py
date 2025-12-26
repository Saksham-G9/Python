from collections import Counter

input = [10, 20, 10, 30, 30, 20]

# Using loop
result = 0
for i in range(len(input)):
    if input[i] not in input[0:i]:
        result += 1
print("Using loop: ", result)

# Using Counter
count_dict = Counter(input)
print("Using counter: ", len(count_dict))

# Using set
print("Using set: ", len(set(input)))
