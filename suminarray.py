#Given an array arr of positive integers and another number x. Determine whether two elements exist in arr whose sum is exactly x or not. Return a boolean value true if two elements exist in arr else return false.

def hasArrayTwoCandidates(arr, x): # worst case
    for i in range(len(arr)):
        for j in range(i + 1, len(arr)):
            if arr[i] + arr[j] == x:
                return "true"
    return "false"



#o(nlogn) using two pointer theorem
def hasArrayTwoCandidates(arr, x):
    arr.sort()  # Sort the array
    n = len(arr)
    l = 0
    h = n - 1
    
    while l < h:
        if x == arr[l] + arr[h]:
            return 1
        elif arr[l] + arr[h] > x:
            h -= 1
        else:
            l += 1
    
    return 0

# O(n)
def hasArrayTwoCandidates(arr,x):
    new=set()
    for i in arr:
        if x-i in new:
            return True
        new.add(i)
    return False
