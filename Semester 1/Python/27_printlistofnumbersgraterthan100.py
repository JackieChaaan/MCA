a=list(map(int,input("Enter the list of numbers: ").split(',')))
b=[a for a in a if a>100]
print(b)
