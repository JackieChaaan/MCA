sentence=input("Enter a sentence: ")
s={}
for i in sentence.lower().split():
    s[i]=s.get(i,0)+1
print(s)
