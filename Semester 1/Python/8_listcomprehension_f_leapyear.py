import datetime

today=datetime.date.today()
year=today.year
print("Current year is",year)
yearend=int(input("Enter a year: "))
lst=[x for x in range(year,yearend+1) if (x%400==0 or x%100!=0) and (x%4==0)]
print(lst)
