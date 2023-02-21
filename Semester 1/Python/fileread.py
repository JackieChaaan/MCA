inf = 0

try:
    inf=open("hello.txt")
    line=inf.read()
    print(line)
except IOError as io:
    print(io)
finally:
    if inf:inf.close()
