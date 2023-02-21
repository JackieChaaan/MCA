def lscheck(str):
    if str.startswith('ls'):
        return str
    else:
        return 'ls'+str
s=input("Enter string: ")
print(lscheck(s))
