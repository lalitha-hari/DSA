
"""Given a string in roman no format (s)  your task is to convert it to an integer . Various symbols and their values are given below.
I 1
V 5
X 10
L 50
C 100
D 500
M 1000

Example 1:

Input:
s = V
Output: 5"""


def romanToDecimal(self, s): 
        roman_values={"I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000}
        number=0
        for i in range(len(s)):
            if i+1<len(s) and roman_values[s[i]]< roman_values[s[i+1]]:
                number-=roman_values[s[i]]
            else:
                number+=roman_values[s[i]]
        return number