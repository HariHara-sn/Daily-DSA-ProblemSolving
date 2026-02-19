# self refers to current object's data.
# cls refers to class variable and class method. Here school is a class variable and get_school is a class method.
class Student:
    school = 'Telusko'
    def __init__(self,ml,m2,m3):
        self.ml = ml
        self.m2 = m2
        self.m3 = m3
        
    def avg(self):
        return (self.ml + self.m2 + self.m3)/3
    
    @classmethod
    def get_school(cls):  # to access class variable we use cls and @classmethod decorator
        return cls.school
        
    
s1 = Student(34,47,32)
s2 = Student(89,32,12)

print(s1.avg())
print(s2.avg())
# print(Student.avg(Student(32,23,3)))  you can do like this also
print(Student.get_school()) # if you dont want to mension the object name then put the classmethod decorator




# Static Method
# Utility method (no self, no cls)

class Math:
    @staticmethod
    def add(a, b):
        print("dont need self and cls")
        return a + b

print(Math.add(5, 5))