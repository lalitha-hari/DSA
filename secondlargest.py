# Given an array arr, return the second largest distinct element from an array. If the second largest element doesn't exist then return -1.
# worst case
def print2largest(arr):
       new=[]
       m1=0
       for i in arr:
           if i not in new:
               new.append(i)
           if m1<i:
               m1=i
       new.remove(m1)
       
      
       return max(new)

# best case
def print2largest(self, arr):
       m1=-1
       m2=-1
       for num in arr:
        
            if num > m1:
                m2 = m1
                m1= num
            elif m1>num>m2 and m1!=num:
               m2=num
               
       return m2