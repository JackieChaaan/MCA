lst=[]
n=int(input("Enter the listitem limit: "))
print("Enter the list elements: ")
for i in range(0,n):
    ele = int(input())
    lst.append(ele)
print("List is ",lst)
s=0
for i in lst:
    s=s+i
print("Sum of all numbers in list is ",s)
