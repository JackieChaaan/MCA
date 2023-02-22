#include<stdio.h>
#include<conio.h>
void main()
{
int arr[10],i,pos,size;
clrscr();
printf("Enter the array size:\n");
scanf("%d",&size);
printf("Enter the elements:\n");
for(i=0;i<size;i++)
{
scanf("%d",&arr[i]);
}
printf("Array is:\n");
for(i=0;i<size;i++)
{
printf("\t%d",arr[i]);
}
printf("\nWhich pos do you want to be delete:\n");
scanf("%d",&pos);
for(i=pos-1;i<=size;i++)
{
arr[i]=arr[i+1];
}
size-=1;
printf("New array is :\n");
for(i=0;i<size;i++)
{
printf("\t%d",arr[i]);
}
getch();
}