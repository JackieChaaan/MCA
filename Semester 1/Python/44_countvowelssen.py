sent=(input("plese write a sentence: "))
lst=list(sent)
vowl=['A','a','E','e','I','i','O','o','U','u']
count=0
for i in lst:
    if i in vowl:
        count+=1
print("The total count of vowels from the sentence '",sent,"' is ",count)
