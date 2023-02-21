n=int(input("Enter the limit: "))
list_names=[]
print("Enter the ",n,"names ")
for i in range(n):
    lst=input()
    list_names.append(lst)
print("Given list is ",list_names)
first_name=['A','a']
outputnames=[name for name in list_names if(name[0] in first_name)]
print("List of names start with A is ",len(outputnames))
