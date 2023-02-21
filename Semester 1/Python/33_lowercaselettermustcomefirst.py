s=input("Enter string: ")
lower=[]
upper=[]
for string in s:
    if string.islower():
        lower.append(string)
    else:
        upper.append(string)
a=" ".join(lower+upper)
print(a)
