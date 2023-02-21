def reverse(strn):
    if len(strn)==1:
        return strn[-1]
    else:
        return strn[-1]+reverse(strn[:-1])
s=input("Enter a string: ")
print("Recursive of string: ",reverse(s))
