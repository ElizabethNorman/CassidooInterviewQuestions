""""
Elizabeth Norman, @spicedboi

Cassidoo Interview Question January 2nd 2023

This week’s question:
Given an array of integers arr and an integer n, return a subarray of arr of length n where the sum is the largest.
Make sure you maintain the order of the original array, and if n is greater than arr.length, you can choose what
you want to return.

Example:

> maxSubarray([-4,2,-5,1,2,3,6,-5,1], 4)
> [1,2,3,6]

> maxSubarray([1,2,0,5], 2)
> [0,5]

"""


def max_subarray(array, count):
    if count > len(array):
        print("cry havok! and let slip the dogs of war!")

    highest_sum = 0
    temp_sum = 0
    temp_a = [0] * count
    highest_array = [0] * count

    for y in range(len(array) - count + 1):
        for x in range(count):
            temp_sum += array[y+x]
            temp_a[x] = array[y + x]
            if temp_sum > highest_sum:
                highest_sum = temp_sum
                highest_array = temp_a
        temp_sum = 0
        temp_a = [0] * count

    return highest_array

if __name__ == '__main__':
    print(max_subarray([1,2,0,5], 2))
    print(max_subarray([-4,2,-5,1,2,3,6,-5,1], 4))


