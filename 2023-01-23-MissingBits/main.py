"""" Elizabeth Norman, @spicedboi

Cassidoo Interview Question January 22nd, 2023

This week’s question:
You are given a list of positive integers which represents some range of integers which has been truncated. 
Find the missing bits, insert ellipses to show that that part has been truncated, and print it. If the consecutive 
values differ by exactly two, then insert the missing value.

Examples:

> missingBits([1,2,3,4,20,21,22,23])
> "[1,2,3,4,...,20,21,22,23]"

> missingBits([1,2,3,5,6])
> "[1,2,3,4,5,6]"

> missingBits([1,3,20,27])
> "[1,2,3,...,20,...,27]"

"""


def missing_bits(numlist):
    output = "["
    ran = len(numlist) - 1
    for x in range(ran):
        output += str(numlist[x])
        output += ","
        if numlist[x + 1] - numlist[x] > 2:
            output += "...,"
        elif numlist[x+1] - numlist[x] == 2:
            output += str(numlist[x] + 1) + ","
    output += str(numlist[len(numlist) - 1])
    output += "]"
    print(output)


if __name__ == '__main__':
    list1 = [1, 2, 3, 4, 20, 21, 22, 23]
    missing_bits(list1)
    list2 = [1,2,3,5,6]
    missing_bits(list2)
    list3 = [1,3,20,27]
    missing_bits(list3)
