#reverse a sentence 
sentence = "Hari is learning Python".split()
i = 0
j = len(sentence) - 1
while(i < j):
    sentence[i],sentence[j] = sentence[j],sentence[i]
    i += 1
    j -= 1
print(sentence)