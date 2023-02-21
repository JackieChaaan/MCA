def oddeven():
    l=list(map(int,input("Enter list: ").split()))
    odd=even=0
    i=0
    while i<len(l):
        if l[i]%2:
            odd=odd+1
        else:
            even=even+1
        i=i+1
    return odd,even
odd,even=oddeven()
print("No.of even numbers: ",even)
print("No.of odd numbers: ",odd)
