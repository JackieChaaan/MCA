l=list(map(int,input("Ente the list of numbers: ").split()))
i=0
while(i<len(l)):
    if(l[i]==237):
        break
    elif(l[i]%2==0):
        print(l[i])
    i=i+1

