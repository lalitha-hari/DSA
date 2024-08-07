def duplicates(self, n, arr):
        new=[]
        dic={}
        for i in arr:
            if i in dic:
                dic[i]+=1
            else:
                dic[i]=1
                
        for k,v in dic.items():
            if v>1:
                new.append(k)
                
        new.sort()
        
        if new==[]:
            return [-1]
        return new