def quicksort(array ,low, high ):
    if ( low<high):
        pi = partition(array , low , high) # need 2 fin pi 
        quicksort(array ,low , pi-1) # appel recursif pr trier cote gauche
        quicksort(array, pi+1, high) # appel recursif pr trier cote droite 


def partition (array,low,high): 
    mid = (low + high) // 2  
    pivot = array[mid]  
    print("Pivot choisi :", pivot)

    # Placer le pivot à la fin pour le traitement (swap avec le dernier élément)
    array[mid], array[high] = array[high], array[mid]


    i= low-1
    for j in range( low , high):
        if  array[j]<pivot:
            i+=1
            temp = array[i]
            array[i]=array[j]
            array[j]=temp 
            print("tab interm : ", array)
    
    temp = array[i+1]
    array[i+1]= array[high]
    array[high]=temp 
    return i+1 

nums=  [ 5,6,2,3,1,8,4]
quicksort(nums,0,len(nums)-1)

for i in nums:
    print(i , " ")

        



