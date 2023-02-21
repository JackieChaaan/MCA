def word(w,n):
    i=0
    l=[]
    while i<n:
        l.append(w)
        i+=1
    return l
w=input("Enter a word: ")
n=int(input("Enter count: "))
l=word(w,n)
i=0
while i<n:
    print(l[i])
    i+=1
