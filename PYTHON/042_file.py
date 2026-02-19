#Reverse a string 
input_string  = "hello_world"
i = 0
j = len(input_string) - 1
input_string = list(input_string)
while i < j:
    input_string[i], input_string[j] = input_string[j], input_string[i]
    i += 1
    j -= 1
input_string = "".join(input_string)