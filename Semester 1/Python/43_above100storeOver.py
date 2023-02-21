lst=[]
n=int(input("Enter the item limit: "))
print("Enter the list of positive integers: ")
for i in range(n):
    itm=int(input())
    lst.append(itm)
print("The given list of positive integers is :",lst)
for i in range(len(lst)):
    if lst[i]>=100:
        lst[i]="Over"
print(lst)

