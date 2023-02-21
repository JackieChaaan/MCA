s=input("Enter a string ")
if(s.endswith("ing")):
    s+='ly'
elif(s.endswith('ly')):
    s+='zzz'
else:
    s+='ing'
print("New string is ",s)
