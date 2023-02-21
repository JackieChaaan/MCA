s=input("Enter string: ")
a=int(len(s)/2)
if((len(s)%2==1)&(len(s)>7)):
    print(s[a-1:a+2])
else:
    print("Enter a string of odd length greater than 7")
    
