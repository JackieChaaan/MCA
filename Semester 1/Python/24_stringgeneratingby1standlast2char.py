s=input("Enter the string: ")
if(len(s)<1):
    print("")
elif len(s)>1:
    a=s[0:2]+s[-2:]
    print(a)
