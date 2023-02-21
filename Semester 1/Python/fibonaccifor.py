n=int(input("Enter the number: "))
n1,n2=0,1
if n<0:
    print("Enter positive number")
elif n==0:
    print("Fibonacci series: ",n1)
else:
    print("Fibonacci series: ",n1, n2, end=" ")
    for i in range(2,n):
        n3=n1+n2
        n1=n2
        n2=n3
        print(n3,end=" ")
