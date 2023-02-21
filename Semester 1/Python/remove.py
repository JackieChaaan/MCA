f1=0
try:
    file=input("Enter filename: ")
    f1=open(file,'r+')
    ln=int(input("enter the line number to remove: "))
    line=f1.readlines()
    line.pop(ln-1)
    f1.truncate(0)
    f1.seek(0)
    f1.writelines(line)

except IOError as io:
    print("No such file",io)
finally:
    if f1:f1.close()
