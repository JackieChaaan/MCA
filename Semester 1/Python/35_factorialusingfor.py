n=int(input("Enter the number: "))
if n<0:
    print("No factorial for negative number")
elif n==0:
    print("Factorial of ",n," is 1")
else:
    fact =1
    for i in range(1,n+1):
        fact=fact*i
    print("Factorial of ",n," is",fact)
