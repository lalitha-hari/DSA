#Function to reverse words in a given string.

'''Input:
S = i.like.this.program.very.much
Output: much.very.program.this.like.i'''
def reverseWords(self,S):
        s=S.split('.')
        new=''
        for i in range(len(s)-1,-1,-1):
            new+=s[i]+"."
           
            
        return new[:len(new)-1]
        