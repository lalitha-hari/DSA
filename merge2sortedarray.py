def mergeSortedArrays(arr1, arr2):
    n, m = len(arr1), len(arr2)
    merged_array = []
    i, j = 0, 0

    while i < n and j < m:
        if arr1[i] <= arr2[j]:
            merged_array.append(arr1[i])
            i += 1
        else:
            merged_array.append(arr2[j])
            j += 1
    while i < n:
        merged_array.append(arr1[i])
        i += 1

    while j < m:
        merged_array.append(arr2[j])
        j += 1

    return merged_array

arr1 = [1, 3, 5, 7]
arr2 = [2, 4, 6, 8]
result = mergeSortedArrays(arr1, arr2)
print(result)  
