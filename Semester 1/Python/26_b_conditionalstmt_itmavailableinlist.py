lst=list(['apple','banana','grapes','orenge'])
print(lst)
itm=input("Enter the item for available in list: ")
f=lst.count(itm)
if f>0:
    print("Available")
else:
    print("Not avilable")
