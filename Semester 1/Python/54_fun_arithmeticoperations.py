def arithmetic(a,b):
    return(a+b,a-b,a*b,a/b)
a=int(input("Enter 1st number: "))
b=int(input("Enter 2nd number: "))
res=arithmetic(a,b)
print("Sum= ",res[0])
print("Difference= ",res[1])
print("Product= ",res[2])
print("Quotient= ",res[3])
