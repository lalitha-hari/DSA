def findTriplets(self, arr, n):
        arr.sort()
        for i in range(n):
            new=set()
            current_sum=0-arr[i]
            for j in range(i+1,n):
                cs=current_sum-arr[j]
                if cs in new:
                    return 1
                new.add(arr[j])
        return 0