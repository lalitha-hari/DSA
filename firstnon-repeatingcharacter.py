#O(N^2)
def nonrepeatingCharacter(self,s):
        for i in range(len(s)):
            if s.count(s[i])==1:
                return s[i]
        return -1
    


#O(N)
def nonrepeatingCharacter(s):
    
    frequency = {}
    for char in s:
        if char in frequency:
            frequency[char] += 1
        else:
            frequency[char] = 1

    for char in s:
        if frequency[char] == 1:
            return char
    
    return -1
s = "swiss"
print(nonrepeatingCharacter(s))  
