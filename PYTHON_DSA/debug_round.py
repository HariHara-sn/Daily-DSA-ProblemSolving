# ❌ Question 3
# class Student:
#     def __str__(self):
#         return name + " " + age

# s = Student("Arun", 20)
# print(s)


#solution
class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def __str__(self):
        return self.name + " " + str(self.age)

s = Student("Arun", 20)
print(s)

#❌ Question 4 - Constructor Overloading Mistake
# class Item:
#     def __init__(self, name):
#         self.name = name
    
#     def __init__(self, name, price):
#         self.name = name
#         self.price = price

# i = Item("Pen")
# print(i.name) #expected ouput : Pen

#solution
class Item:
    def __init__(self, name, price=0):
        self.name = name
        self.price = price

i = Item("Pen")
print(i.name)

# ❌ Question 5 — Inheritance Constructor Errors
# class A:
#     def __init__(self, x):
#         self.x = x

# class B(A):
#     def __init__(self, y):
#         self.y = y
#         A.__init__(x)

# b = B(5)
# print(b.x)

#solution
class A:
    def __init__(self, x):
        self.x = x

class B(A):
    def __init__(self, y):
        self.y = y
        A.__init__(self, y) # Pass self and y to A's constructor

b = B(5)
print(b.x)

