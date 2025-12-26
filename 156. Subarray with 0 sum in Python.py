def zero_sum_subarray():
    data = [1, 4, 13, -3, -10, 5]
    curr_sum = 0

    seen = set()

    for el in data:

        curr_sum += el

        if curr_sum == 0 or curr_sum in seen:
            return True
        else:
            seen.add(curr_sum)
    return False


print(zero_sum_subarray())
