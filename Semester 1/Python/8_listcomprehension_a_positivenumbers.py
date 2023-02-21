n=int(input("Enter Total number of elements in list : "))
list_a=[]
print("Enter the ",n,"real numbers: ")
for i in range(n):
    value=int(input())
    list_a.append(value)

print("Given list is ",list_a)  
test = [each for each in list_a if each>0]
print("Positive numbers from the list",list_a,"is ",test)


"""for i in lists:
     if i>0:
        print(i)"""
