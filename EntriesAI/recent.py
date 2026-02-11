# QUESTION 1: Salary Calculation
# Write a function that takes basic_salary as input.
# - If basic_salary is less than 20,000 → HRA = 20%, DA = 10%
# - Otherwise → HRA = 30%, DA = 20%
# Return the final salary (basic + HRA + DA).
def calculate_salary(basic_salary):
    HRA = 30
    DA = 20
    if basic_salary < 20000:
        HRA = 20
        DA = 10
        
    return basic_salary + (basic_salary * HRA / 100)  + (basic_salary * DA / 100)

# QUESTION 2: Attendance Check
# Write a function that takes total_days and present_days.
# - If attendance percentage is 75% or more, return "Eligible"
# - Otherwise, return "Not Eligible"
def check_attendance(total_days, present_days):
    attendancePercentage = (present_days / total_days) * 100
    if attendancePercentage >= 75:
        return "Eligible"
    return "Not Eligible"


# QUESTION 3: Transaction Summary
# Write a function that takes a list of transaction amounts (positive or negative).
# Return a dictionary with:
# {
#   "credit": total of positive amounts,
#   "debit": total of negative amounts,
#   "balance": final balance
# }
# [1000, 500, 300, -50, -100, -150]
def transaction_summary(transactions):
    pos = []
    neg = []
    for i in transactions:
        if i > 0:
            pos.append(i)
        else:
            neg.append(i)
    posSum = sum(pos)
    negSum = sum(neg)
    balance = posSum + negSum
    result = {
        "credit": posSum,
        "debit" : negSum,
        "balance" : balance
    }
    return result


# QUESTION 4: Employee ID Validation
# Write a function that takes an employee_id string.
# Valid format:
# - Starts with "EMP"
# - Followed by exactly 4 digits
# Return True if valid, otherwise False.
def validate_employee_id(employee_id):
    if len(employee_id) != 7:
        return False
    elif not employee_id.startswith("EMP"):
        return False
    if employee_id[3:].isdigit():
        return True


# QUESTION 5: Simple Report Generator
# Write a function that takes a list of employee names.
# Return a single string where each name appears on a new line
# with numbering starting from 1.
def generate_employee_report(names):
    idx = 1
    res = ""
    for i in names:
        res = res + f"{idx} {i} \n"
        idx += 1
    return res


print(calculate_salary(30000))
print(check_attendance(28, 30))
print(transaction_summary([1000, -200, 500, -150, -50, 300]))
print(validate_employee_id("EMP1234"))
print(generate_employee_report(["Hari","Bharath","vimal"]))