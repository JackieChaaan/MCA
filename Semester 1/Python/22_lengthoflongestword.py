n=input("Enter a string")
a=n.split()
a.sort(key=len)
print(a)
print("Length of longest word= ",len(a[-1]))
if len(a[-1])==len([-2]):
                  print("BINGO")
