def remove_duplicate(arr):
        if not arr:
           return 0
    
        n = len(arr)
        if n == 1:
            return 1
        
        i = 0 
        for j in range(1, n):
            if arr[j] != arr[i]:
                i += 1
                arr[i] = arr[j]
        
        
        return i + 1
arr1 = [2, 2, 2, 2, 2]
print(remove_duplicate(arr1))
