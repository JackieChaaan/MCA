dict={}

n=int(input("Total number of elements in dict : "))
for i in range(n):
    a=input("Enter Key: ")
    b=input("Enter Value: ")
    dict[a]=b
print("The dictionary is: ",dict)
print("The dictionary in ascending order(key) is: ",sorted(dict.items()))
print("The dictionary in descending order(key) is: ",sorted(dict.items(),reverse=True))
