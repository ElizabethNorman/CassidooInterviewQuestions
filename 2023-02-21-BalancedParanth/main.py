"""
Cassidoo Interview Question February 21st 2023

Elizabeth Norman @spicedboi


This week’s question:
Given a string of parenthesis, return the number of parenthesis you need to add to the string in order for it to be balanced.

Examples:

> numBalanced(`()`)
> 0

> numBalanced(`(()`)
> 1

> numBalanced(`))()))))()`)
> 6

> numBalanced(`)))))`)
> 5

"""


def numBalanced(s):
    s = ''.join(sorted(s))
    s = s.split(')')
    print(abs(len(s[0]) - len(s) + 1))


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    numBalanced('()')
    numBalanced('(()')
    numBalanced('))()))))()')
    numBalanced(')))))')
