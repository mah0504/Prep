class Solution:
    somme = 0 
    maxi = 0
#max et sum sont predef en python les utiliser comme variables pose probleme 
    def  maxAscendingSum(self, nums):   
        if len(nums)==0:
            return 0; 
        if len(nums)==1:
            return nums[0]    
        

        somme = nums[0]
        maxi = 0
        for  i in range (1, len(nums)):
            if  nums[i]>nums[i-1]:
                somme+= nums[i]
            else : 
                maxi = max(maxi,somme)
                somme=nums[i]
        

        return max(maxi,somme )



    def longestPalindrome(self, s):

        dictio= {}
        found = False
        nbrMax= 0
        maximP = 0
        if len(s)==1:
            return 1
        
        for i in range(len(s)):
            if  s[i] not in dictio:
               dictio[s[i]]=1 
            else:
               dictio[s[i]]+=1 
        
        for  value in dictio.values():
            if value%2==0:
                nbrMax+= value 
                
            else : 
                # garder en tête l'index impair max puis add 
                if value>maximP:
                    maximP=value 

                nbrMax+=value-1

        nbrMax+=maximP

        return nbrMax

            # ajout de ttes les frequences paires 
            # si on a trv un de val impaire mettre booleen trouvé true puis increm de 1 à la fin 

        

        






sol = Solution()
tab1 = [10, 20, 30, 5, 10, 50]
s1="abccccdd" 
print(sol.longestPalindrome(s1))
# print(sol.maxAscendingSum(tab1))  

