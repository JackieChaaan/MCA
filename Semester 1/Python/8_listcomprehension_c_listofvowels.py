vwls=['A','E','I','O','U','a','e','i','o','u']
strng=input("enter a string: ")

lst=[i for i in strng if i in vwls]
print("List of vowels is",lst)
