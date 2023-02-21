dict1={}
dict2={}
dict3={}

n=int(input("Total number of elements in dict 1 : "))
for i in range(n):
    k1=input("Enter Key: ")
    v1=input("Enter Value: ")
    dict1[k1]=v1
print(dict1)


for i in range(n):
    k2=input("Enter Key: ")
    v2=input("Enter Value: ")
    dict2[k2]=v2
print(dict2)

dict1.update(dict2)
print(dict1)
        

