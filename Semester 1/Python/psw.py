import re
pswd=input("Enter the password: ")
pattern="^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#@$]).{6,16}$"

valid=re.search(pattern,pswd)
if valid:
    print("Valid")
else:
    print("Not valid")
