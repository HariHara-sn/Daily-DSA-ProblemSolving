# ways to accept input from user
'''
#method - 1
arr = list(map(int, input().split())) # if you are getting input use this

#method - 2
arr = [int(x) for x in input("enter :").split()]
print(arr)

#method - 3
# Expecting exactly 3 numbers
a, b, c = map(int, input("enter 3 numbers: ").split())

print(arr)
print(type(arr))

'''
a, b, c = map(int, input("enter 3 numbers: ").split())
print(a, b, c)