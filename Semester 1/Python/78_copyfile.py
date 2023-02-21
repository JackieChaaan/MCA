file1=0
file2=0
try:
    file1=open('file1.txt')
    file2=open('file2.txt','w')

    line=file1.readline()
    while line:
        file2.write(line)
        line=file1.readline()
    
except IOError as io:
    print(io)
finally:
    if file1:file1.close()
    if file2:file2.close()
    
