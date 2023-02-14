"""
Elizabeth Norman

Cassidoo Interview Question Feb 13th

This week’s question:
Print the digits 0 through 100 without using the characters
1, 2, 3, 4, 5, 6, 7, 8, or 9 in your code. Get creative!
"""
import math


def print_to_100():
    for x in range(ord('e')):
        print(x)


def print_to_100_2():
    x = 0
    print(x)
    while len(str(x)) < len("000"):
        x = x + (True & True)
        print(x)



def print_to_100_3():
    streeng = "hello this is a string that is part of my count to one hundred method that will help us succeed bigly"
    for x in range(len(streeng)):
        print(x)


def print_to_100_4():
    uno = math.floor(math.pi/math.pi)
    x = 0
    print(x)
    while len(str(x)) < len("ooo"):
        x = x + uno
        print(x)


def print_to_100_5():
    end = len("four") * len("times") * len("five▣")
    x = 0
    one = len("①")
    print(x)
    while x < end:
        x = x + one
        print(x)


if __name__ == '__main__':
    print_to_100()
    print_to_100_2()
    print_to_100_3()
    print_to_100_4()
    print_to_100_5()
