# Tricks
'''If you have a list like this [[1, 1], [2, 2], [3]] how will you normalize this'''
# Option 1: The sum() Trick (Shortest Code)
# You can use sum() with an empty list as the "start" value. This effectively "adds" all the inner lists together.
# python
nested_list = [[1, 1], [2, 2], [3]]

flat_list = sum(nested_list, [])

print(flat_list)
# Output: [1, 1, 2, 2, 3]
#----------------------------------------------------------------------------------
# Option 2 :  in dict
freq  = {1 : 2, 2 : 2, 3 : 1}
res = []
for key, value in freq.items():
            res.extend([key] * value)

#---------------------------------------------------------------------------------------
freq = {1: 2, 2: 2, 3: 1}

# Repeat 'key' for 'value' number of times
result = [key for key, value in freq.items() for _ in range(value)]

print(result) 
# Output: [1, 1, 2, 2, 3]

