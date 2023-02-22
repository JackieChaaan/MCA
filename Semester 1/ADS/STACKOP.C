#include<stdio.h>
#include<conio.h>
#define MAX 5
int stack[MAX],top=-1,item;
void push();
void pop();
void traverse();
void main()
{
int ch,flag=1;
clrscr();
while(flag==1)
{
printf("\n\n\tStack Operations\n\n1.PUSH Operation\n2.POP Operation\n3.Traverse\n4.Exit\nEnter Your Choice:\n");
scanf("%d",&ch);
switch(ch)
{
case 1:
push();
break;
case 2:
pop();
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
void push()
{
if(top==MAX-1)
{
printf("Stack is full,Overflow");
}
else
{
top+=1;
printf("Enter the element:\n");
scanf("%d",&item);
stack[top]= item;
printf("Item %d inserted successfully " ,item);
}
}
void pop()
{
if(top==-1)
{
printf("Underflow,stack is empty");
}
else
{
printf("Item %d poped from the stack ",stack[top]);
top-=1;
}
}
void traverse()
{
int i;
if(top==-1)
{
printf("Underflow,stack is empty");
}
else
{
for(i=top;i>=0;i--)
{
printf("\t%d",stack[i]);
}
}
}