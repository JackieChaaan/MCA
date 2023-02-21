num1=int(input("Enter the 1st number: "))
num2=int(input("Enter the 2nd number: "))

for i in range(1,num1+1):
    if i<= num2:
        if num1%i == 0 and num2%i == 0:
            g=i
print("The GCD of ",num1," & ",num2," is ",g)
