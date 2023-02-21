n=int(input("Enter a integer between 90 and 120: "))
if n>90 and n<120:
        print(n)
else:
    raise ValueError("Abnormal Condition")
