a=list(map(int,input("Enter list1: ").split(',')))
b=list(map(int,input("Ente list2: ").split(',')))
if(set(a)==set(b)):
    print("2 lsits a nd b are equal")
else:
    print("Lists a and b are not equal")
