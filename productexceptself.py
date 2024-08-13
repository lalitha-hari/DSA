'''Given an array nums[], construct a Product Array P (of same size n) such that P[i] is equal to the product of all the elements of nums except nums[i].

 '''
def productExceptSelf(self,n, nums):
        left=[1]*n
        right=[1]*n
        p=[0]*n
        for i in range(1,n):
            left[i]=left[i-1]*nums[i-1]
        for i in range(n-2,-1,-1):
            right[i]=right[i+1]*nums[i+1]
        for i in range(n):
            p[i]=left[i]*right[i]
        return p