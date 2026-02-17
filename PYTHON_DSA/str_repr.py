'''
1) 
when you print(c) here c is a object,
so, insted of throwing err, python convert the obj to string so it calls the __str__ method,
eg: python automatically calls the c.__str__()

2) __init__ is NOT required for an object to exist.
You only need __init__ when you want to initialize object attributes.
Because Python gives every class a default constructor internally.

3) In Python, __repr__ is a special (or "dunder", for double-underscore) method that 
provides the official string representation of an object, primarily intended for developers and debugging. 
'''
class Car:
    def __str__(self):
        return "This is a car object (human friendly)."
    
    def __repr__(self):
        return "Car()  # developer friendly"
    
c = Car()

print(c)          # calls __str__
print(repr(c))    # calls __repr__

