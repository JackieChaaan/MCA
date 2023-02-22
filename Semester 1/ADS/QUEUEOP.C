#include<stdio.h>
#include<conio.h>
#define MAX 5
int f=-1,r=-1,q[MAX],item;
void enqueue();
void dequeue();
void traverse();
void main()
{
int ch,flag=1;
clrscr();
while(flag==1)
{
printf("\n\tQueue Operations:\n\n1.Queue Insertion\n2.Queue Deletion\n3.Traverse\n4.Exit\n\nEnter your choice:\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
enqueue();
break;
case 2:
dequeue();
break;
case 3:
traverse();
break;
case 4:
exit(0);
default:
printf("Invalid choice");
}
}
getch();
}
void enqueue()
{
if(r==MAX-1)
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
q[f]=item;
}
else
{
r+=1;
q[r]=item;
}
printf("Item %d inserted successfully ",item);
}
}
void dequeue()
{
if(f==-1 && r==-1 || f>r)
{
printf("Queue is empty");
}
else
{
printf("removing % d from queue ",q[f]);
f+=1;
}
}
void traverse()
{
int i;
if(f==-1 && r==-1 || f>r)
{
printf("Q is empty");
}
else
{
printf("Q is:\n");
for(i=f;i<=r;i++)
{
printf("\t%d",q[i]);
}
}
}
