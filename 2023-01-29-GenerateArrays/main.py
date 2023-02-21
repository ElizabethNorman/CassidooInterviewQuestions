""" Elizabeth Norman

Cassidoo Interview Question Jan 29th 2023

This week’s question:
Given a positive integer, generate an array in which every element is an array that goes from 1 to the
index of that array.

Example:

> generateArrays(4)
> [[1], [1, 2], [1, 2, 3], [1, 2, 3, 4]]

> generateArrays(1)
> [[1]]
"""


def generate_arrays(count):
    if count < 1:
        return

    a = [[0]*count for i in range(count)]

    for x in range(count):
        t = x + 1
        temp = [0] * t
        for y in range(t):
            temp[y] = y + 1
        a[x] = temp

    return a


if __name__ == '__main__':
    print(generate_arrays(4))
    print(generate_arrays(1))
    print(generate_arrays(10))

