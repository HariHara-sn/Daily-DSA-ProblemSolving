# Hidden tricks about min

students = ["A", "B", "C"]
scores = {"A": 90, "B": 80, "C": 85}
res = min(students, key=lambda s : scores[s])

#     Expanded version
# students = ["A", "B", "C"]
# scores = {"A": 90, "B": 80, "C": 85}
# fun = lambda s : scores[s]
# res = min(students, key=fun)

# This is how its work internally
# print(min(fun("A"), fun("B"), fun("C")))


#The min fun works like for loop taking each val