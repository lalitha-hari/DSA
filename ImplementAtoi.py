'''Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. If the conversion is not feasible, the function should return -1.

Note: Conversion is feasible only if all characters in the string are numeric or if its first character is '-' and rest are numeric.

Examples:

Input: s = "-123"
Output: -123'''

def atoi(self,s):
        if s[0]=="-" and s[1:].isdigit():
            return int(s)
            
        elif s.isdigit():
            return int(s)
        else:
            return -1