import math
n1=int(input("Enter 4 digit start range: "))
while(len(str(n1))!=4):
    print("Invalid,Please enter a four digit number: ")
    n1=int(input())
n2=int(input("Enter 4 digit end range: "))
while(len(str(n2))!=4):
    print("Invalid,Please enter a four digit number: ")
    n2=int(input())

for i in range(n1,n2):
    if int(math.sqrt(i))**2==i:
           j=i
           while j>0:
               if (j%10)%2!=0:
                   j=int(j/10)
                   break
               else:
                    print(i)
           
