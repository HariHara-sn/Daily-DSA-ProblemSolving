#Move Zero At End
def method_1(arr):
    index = 0
    for i in range(len(arr) - 1):
        if(arr[i] != 0):
            arr[index] = arr[i]
            index += 1
            
    #remaining zeros
    for i in range(index,len(arr)):
        arr[i] = 0
    print(arr) 


def method_2(arr):
    nonZero = 0
    for i in range(len(arr)):
        if(arr[i] != 0):
            arr[i],arr[nonZero] = arr[nonZero],arr[i]
            nonZero += 1
    
    print("way 1 ",*arr[:len(arr)]) # way 1 to print without []
    print("way 2 ", " ".join(map(str, arr))) # way 2
    print("way 3 ",*arr) # way 3
    

arr = [1,0,2,0,3,0,4,5]
method_1(arr)
method_2(arr)