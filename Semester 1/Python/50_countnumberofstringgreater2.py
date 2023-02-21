strn=list(input("Enter sentence: ").split())
i=c=0
while i<len(strn):
    if i<len(strn[i])>=2 and (strn[i][0].lower()==strn[i][-1].lower()):
                              c+=1
i+=1
print("Numbers of string= ",c)
