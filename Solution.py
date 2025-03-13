class Solution(object):
    def searchMatrix(self, matrix, target):
        """
        :type matrix: List[List[int]]
        :type target: int
        :rtype: bool
        """
        # check 1e et 2e case au cas ou 
        
        
        for i in range(0, len(matrix)):
            verif = target>= matrix[i][0] and target<=matrix[i][len(matrix[0])-1]
            print("result ligne", i , "pr val", verif )
            if verif:
                # bonne intervalle 
                index=i 
                print("index ligne", index)
                break
            if not verif and i==len(matrix)-1:
                return False 
            
        #binary search sur la ligne trouvee 
        s = 0 
        e = len(matrix[0])-1
        while (s<=e):
            middle = (s+e)//2 
            print("middle elem ", matrix[index][middle])

            if target==matrix[index][middle]:
                return True 
            elif target> matrix[index][middle]:
                s= middle+1  # end reste le meme 
            elif target<matrix[index][middle]:
                e=middle-1 
            
            
        return False
        
        
        







sol = Solution()

matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]]
target = 3

# len(matrix)->longueur    len(matrix[0])->largeur

# print("taille", len(matrix[0]))

print(sol.searchMatrix(matrix, target))  # True attendu

target = 13
print(sol.searchMatrix(matrix, target))  # False attendu
tab=[[1,3]]
print(sol.searchMatrix( tab, 2))
        #[[1,3,5,7],[10,11,16,20],[23,30,34,60]] target  3 -> true
        #[[1,3,5,7],[10,11,16,20],[23,30,34,60]] target 13 -> false




        # comparer targe au 1er elem et dernier elem de chaque ligne 
        # si inclu dedans return true
        # si exclu return false
        # dans cette ligne effectuer binary search aka utiliser medium 
        # si on trv pas false
