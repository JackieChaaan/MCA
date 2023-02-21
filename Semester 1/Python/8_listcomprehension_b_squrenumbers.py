n=int(input("Enter Total number of elements in list : "))
list_b=[]
print("Enter the ",n,"real numbers: ")
for i in range(n):
    value=int(input())
    list_b.append(value)
  
squnum = [each*each for each in list_b]
print("list of squres of ",list_b,"is ",squnum)

