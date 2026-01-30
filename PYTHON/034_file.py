#return most repeating digit
arr = [2, 2, 3, 3, 3, 4, 5, 5]

dict = {}
for ele in arr:
    if ele not in dict:
        dict[ele] = 1
    else:
        dict[ele] += 1
max_value = 0
for k,v in dict.items():
    if v == max(dict.values()):
        print("most repeating num is : ", k)
        break

    

   