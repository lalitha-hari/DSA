def maxSubArraySum(self,arr): # using kadane's algorithm
        large=float("-inf")
        small=0

        for i in range(len(arr)):
            small+=arr[i]
            if small>large:
                large=small
                
            if small<0:
                small=0

        return large