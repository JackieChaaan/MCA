s=input("Enter the string: ")
a=s.find('not')
b=s.find('bad')
if b>a and b>0 and a>0:
    print(s.lower().replace(s[a:b+4],'good',1))
