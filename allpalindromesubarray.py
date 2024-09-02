def palindromeSubStrs(s):
        new=set()
        for i in range(len(s)):
            for j in range(i+1,len(s)+1):
                sub=s[i:j]
                if sub==sub[::-1]:
                   new.add(sub)
        return len(new)+1

print(palindromeSubStrs("abbaea"))
#------------------------------------------------------------------------------
# def palindromeSubStrs(s):
#         new=set()
        
#         def selection(i,j):
#             while i>=0 and j < len(s) and s[i]==s[j]:
#                 new.add(s[i:j+1])
#                 i-=1
#                 j+=1
         
        
#         for i in range(len(s)):
#             selection(i,i)
#             selection(i,i+1)

#         return len(new)

# print(palindromeSubStrs("abaab"))
