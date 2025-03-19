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
        
def findMin(self, nums):
        s = 0
        e= len(nums)-1
        while (s<=e):
            if (e-s)==0:
                return nums[s]
            if (e-s)==1:
                return min(nums[s],nums[e])

            mid = (s+e)//2 
            if nums[mid]<nums[mid-1]:
                return nums[mid]
            elif nums[mid]>nums[s] and nums[mid]> nums[e]:
                s = mid  
            elif nums[mid]<nums[s] and nums[mid]<nums[e]:
                e= mid 
            elif nums[mid]>nums[s] and nums[mid]<nums[e]:
                e= mid 
            elif nums[mid]<nums[s] and nums[mid]>nums[e]:
                s= mid
        return 0 


def search(self, nums, target):
    return 0 




        


sol = Solution()

nums0 = [4,5,6,7,0,1,2], target = 0
nums1 = [4,5,6,7,0,1,2], target = 3
nums2 = [1], target = 0
