try:
    a=int(input("Enter value of a: "))
    b=int(input("Enter value of b: "))
    c=a/b
    print(c);
except ZeroDivisionError:
    print("Cannot divided by 0")
except ValueError:
    print("Cannot convert string to integer")
