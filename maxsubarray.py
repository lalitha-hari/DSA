
#best case scenario of O(N)
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




#worst case complexity O(N

def maxSubArraySum(arr):
    n = len(arr)
    max_sum = float('-inf')  # Initialize with the smallest possible value

    # Outer loop to start each subarray
    for i in range(n):
        current_sum = 0
        # Inner loop to calculate the sum of the subarray starting at index i
        for j in range(i, n):
            current_sum += arr[j]
            # Update max_sum if the current subarray sum is greater
            if current_sum > max_sum:
                max_sum = current_sum

    return max_sum