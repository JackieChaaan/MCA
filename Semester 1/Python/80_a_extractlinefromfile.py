f=0;
try:
    file=input("Enter the file name: ");
    f=open(file,'r')
    w=input('Enter the word: ');
    for block in f.read().split('.'):
        if w in block:
            print(block);
except IOError as io:
    print("No such file exist")
finally:
    if f:f.close()
