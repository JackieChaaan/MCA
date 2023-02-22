#include<stdio.h>
#include<conio.h>
void main()
{
int a[10],b[10],c[10],d[40],i,j,k,n1,n2,n3,n4,temp,m;
clrscr();
printf("Enter the limit of 1st array: ");
scanf("%d",&n1);
printf("Enter the elements:\n");
for(i=0;i<n1;i++)
{
scanf("%d",&a[i]);
}
printf("1st array:\n");
for(i=0;i<n1;i++)
{
printf("%d\t",a[i]);
}
for(i=0;i<n1;i++)
{
for(j=0;j<n1-i-1;j++)
{
if(a[j]>a[j+1])
{
temp=a[j+1];
a[j+1]=a[j];
a[j]=temp;
}
}
}
printf("\n1st sorted array is:\n");
for(i=0;i<n1;i++)
{
printf("%d\t",a[i]);
}
printf("\nEnter the limit of second array: ");
scanf("%d",&n2);
printf("Enter the 2nd array elements:\n");
for(j=0;j<n2;j++)
{
scanf("%d",&b[j]);
}
printf("Second array is :\n");
for(j=0;j<n2;j++)
{
printf("%d\t",b[j]);
}
for(i=0;i<n2;i++)
{
for(j=0;j<n2-i-1;j++)
{
if(b[j]>b[j+1])
{
temp=b[j+1];
b[j+1]=b[j];
b[j]=temp;
}
}
}
printf("\n2nd sorted array is:\n");
for(i=0;i<n2;i++)
{
printf("%d\t",b[i]);
}
printf("\nEnter the limit of 3rd array: ");
scanf("%d",&n3);
printf("Enter the 3rd array elements:\n");
for(k=0;k<n3;k++)
{
scanf("%d",&c[k]);
}
printf("3rd array is:\n");
for(i=0;i<n3;i++)
{
printf("%d\t",c[i]);
}
for(i=0;i<n3;i++)
{
for(j=0;j<n3-i-1;j++)
{
if(c[j]>c[j+1])
{
temp=c[j+1];
c[j+1]=c[j];
c[j]=temp;
}
}
}
printf("\n3rd sorted array is:\n");
for(i=0;i<n3;i++)
{
printf("%d\t",c[i]);
}
n4=n1+n2+n3;
i=0;j=0;k=0;m=0;
while(i<n1 && j<n2 && k<n3)
{
  if(a[i]<b[j])
  {
   if(a[i]<c[k])
   {
    d[m]=a[i];
    i+=1;
    m+=1;
   }
   else{
    d[m]=c[k];
    k+=1;
    m+=1;
   }
  }
  else{
   if(b[j]<c[k])
   {
   d[m]=b[j];
   j+=1;
   m+=1;
   }
   else{
   d[m]=c[k];
   k+=1;
   m+=1;
   }
  }
}
while(i<n1 && j<n2)
{
 if(a[i]<b[j])
 {
 d[m]=a[i];
 i+=1;
 m+=1;
 }
 else{
 d[m]=b[j];
 j+=1;
 m+=1;
 }
}
while(j<n2 && k<n3)
{
if(b[j]<c[k])
{
d[m]=b[j];
j+=1;
m+=1;
}
else{
d[m]=c[k];
k+=1;
m+=1;
}
}
while(i<n1 && k<n3)
{
if(a[i]<c[k])
{
d[m]=a[i];
i+=1;
m+=1;
}
else{
d[m]=c[k];
k+=1;
m+=1;
}
}
while(i<n1)
{
d[m]=a[i];
i+=1;
m+=1;
}
while(j<n2)
{
d[m]=b[j];
j+=1;
m+=1;
}
while(k<n3)
{
d[m]=c[k];
k+=1;
m+=1;
}
printf("\nSorted array is:\n");
for(i=0;i<n4;i++)
{
printf("%d\t",d[i]);
}
getch();
}