# Student Score Analyzer
# You are given a list of students with their marks in three subjects:
# Math, Science, and English.

# Each student record contains:
#  Student name
#  Marks in three subjects
#---------------------------------
# Tasks to Perform
# 1. Calculate the average marks for each student.
# 2. Assign a grade based on the average score:
# Average Marks Grade
# ≥ 80 A
# ≥ 60 and < 80 B
# ≥ 40 and < 60 C
# < 40 F
# 3. IdenƟfy and list students who have failed (Grade F).
# 4. Print the result in the specified output format.

# Expected Output Format
# Name: Anil | Average: 77.33 | Grade: B

# Name: Bhavya | Average: 45.00 | Grade: C
# Name: Charan | Average: 90.00 | Grade: A
# Name: Divya | Average: 31.00 | Grade: F

# Failed Students:
# Divya
#-----------------------------------------------------------------------------------------------
students = [
    {"name": "Anil", "marks": [78, 85, 69]},
    {"name": "Bhavya", "marks": [45, 52, 38]},
    {"name": "Charan", "marks": [90, 92, 88]},
    {"name": "Divya", "marks": [30, 35, 28]}
]
result = []
def grade(avg):
    if avg >= 80: return 'A'
    if avg >= 60: return 'B'
    if avg >= 40: return 'C'
    return 'F'
    
for i in students:
    val = round(sum(i['marks']) / len(i['marks']), 2)
    result.append({'name': i['name'],'Average' :  val, 'Grade': grade(val)})

for i in result:
    print("Name: ",i['name'], "|", "Average:", i['Average'], "|", "Grade:", i['Grade'])

print("Failed Students:")
for i in result:
    if i['Grade'] == 'F':
        print(i["name"])
    