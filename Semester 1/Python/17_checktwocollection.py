l1=list(map(int,input("Enter the first list: ").split()))
l2=list(map(int,input("Enter the 2nd list: ").split()))

if(len(l1)==len(l2)):
    print("Both list has same length")
else:
    print("Both list has different length")

if(sum(l1)==sum(l2)):
    print("Both list has same sum")
else:
     print("Both list has different sum")

if(set(l1)&set(l2)):
    print("common values are ",set(l1)&set(l2))
else:
    print("No common values ")
