from collections import deque


def subarray_with_given_sum(elements: list[int], given_sum: int) -> bool:
    window = deque()
    curr_sum = 0
    for el in elements:
        curr_sum += el

        while curr_sum > given_sum:
            value = window.popleft()
            curr_sum -= value

        if curr_sum == given_sum:
            return True
        window.append(el)
    return False


elements = [2, 4, 20, 3, 10, 5]
print(subarray_with_given_sum(elements, 34))
