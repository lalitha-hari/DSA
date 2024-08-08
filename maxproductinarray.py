# Function to find maximum
# product subarray

# best case with O(N) 
def maxProduct(self,arr, n):
	small=arr[0]
	large=arr[0]
	result=arr[0]
	for i in range(1,len(arr)):
		current=arr[i]
		temp_max=max(current,small*current,large*current)
		small=min(current,small*current,large*current)
		large=temp_max
		if large>result:
			result=large
	return result

def maxProduct(arr, n):
    max_product = float('-inf')  # Start with the smallest possible value

    for i in range(n):
        current_product = 1
        # Inner loop to calculate the product of the subarray starting at index i
        for j in range(i, n):
            current_product *= arr[j]
            # Update max_product if the current subarray product is greater
            if current_product > max_product:
                max_product = current_product

    return max_product

