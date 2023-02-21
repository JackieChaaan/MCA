n=int(input("Enter the limit: "))
list_e=[]
print("Enter the numbers: ")
for i in range(n):
    lst=int(input())
    list_e.append(lst)
print("Given list is ",list_e)
oddnum=[i for i in list_e if i%2]
print("After removing even numbers from list ",list_e,"is becom ",oddnum) 
