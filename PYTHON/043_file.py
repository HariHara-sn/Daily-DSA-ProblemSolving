input_string = "a-bC-dEf-ghIj"

#output :  "j-Ih-gfE-dCba"
input_string = list(input_string)
i = 0
j = len(input_string) - 1
while i < j:
    if input_string[i].isalpha() and input_string[j].isalpha():
        input_string[i], input_string[j] = input_string[j], input_string[i]
        i += 1
        j -= 1
    elif input_string[i].isalpha():
        j -= 1
    else:
        i += 1
    

input_string = "".join(input_string)
print(input_string)