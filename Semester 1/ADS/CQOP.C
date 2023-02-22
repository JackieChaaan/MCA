#include<stdio.h>
#include<conio.h>
#define MAX 5
int f=-1,r=-1,cq[MAX],item;
void cqenqueue();
void cqdequeue();
void cqtraverse();
void main()
{
int ch,flag=1;
clrscr();
while(flag==1)
{
printf("\n\tCircular Queue Operations:\n\n1.CQ Insertion\n2.CQ Deletion\n3.Traverse\n4.Exit\n\nEnter your choice:\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
cqenqueue();
break;
case 2:
cqdequeue();
break;
case 3:
cqtraverse();
break;
case 4:
exit(0);
default:
printf("Invalid choice");
}
}
getch();
}
void cqenqueue()
{
if((r=f+1) || (f==0 && r == MAX-1))
{
printf("Q is full,overflow");
}
else
{
printf("Enter the item:\n");
scanf("%d",&item);
if(f==-1 && r==-1)
{
f+=1;
r+=1;
cq[f]=item;
}
else
{
r=(r+1)%MAX;
cq[r]=item;
}
printf("Item %d inserted successfully ",item);
}
}
void cqdequeue()
{
if(f==-1 && r==-1)
{
printf("Queue is empty");
}
else
{
if(f==r)
{
printf("Removing %d from cq ",cq[r]);
f=-1;
r=-1;
}
else
{
printf("removing % d from queue ",cq[f]);
f=(f+1)%MAX;
}
}
}
void cqtraverse()
{
int i;
if(f==-1 && r==-1)
{
printf("CQ is empty");
}
else
{
printf("Q is:\n");
for(i=f;i!=r;i=(i+1)%MAX)
{
printf("\t%d",cq[i]);
}
}
}
