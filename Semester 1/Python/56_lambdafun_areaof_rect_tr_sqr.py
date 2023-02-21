sqr=lambda a:a*a
rect=lambda l,b:l*b
tr=lambda b,h:0.5*b*h
x=int(input("Enter side length of squre: "))
y=int(input("Enter side length of rectangle: "))
z=int(input("Enter breadth of retangle: "))
p=int(input("Enter base of triangle: "))
q=int(input("Enter height of triangle: "))

print("Area of squre: ",sqr(x))
print("Area of Rectangle: ",rect(y,z))
print("Area of triangle: ",tr(p,q))
