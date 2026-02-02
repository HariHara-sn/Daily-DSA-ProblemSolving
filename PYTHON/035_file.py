#print the idx when it start
haystack = "sadbutsad"
needle = "sad"
for i in range(len(haystack)):
    cpyhaystack = haystack[i : -1]
    print(cpyhaystack) 
    if cpyhaystack.startswith(needle):
        print(i)
        break
            
