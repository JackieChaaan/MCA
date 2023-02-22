#define MAX 30
#include<stdio.h>
#include<conio.h>
void create(int set[]);
void print(int set[]);
void Union(int set1[],int set2[],int set3[]);
void intersection(int set1[],int set2[],int set3[]);
void difference(int set1[],int set2[],int set3[]);
void symmdiff(int set1[],int set2[],int set3[]);
int member(int set[],int x);


void main()
{ int set1[MAX],set2[MAX],set3[MAX];
  int x,op;
  clrscr();
  flushall();
  set1[0]=set2[0]=set3[0]=0;
  do
   { printf("\n1)Create\n2)Print\n3)Union\n4)Intersection\n5)Difference");
     printf("\n6Symmetrec Difference \n7)Quit");
     printf("\nEnter Your Choice:");
     scanf("%d",&op);
     switch(op)
      {
    case 1: printf("\nCreting First Set*******");
        create(set1);
        printf("\nCreating Second Set*****");
        create(set2);
        break;
    case 2: printf("\nFirst Set :\n");
        print(set1);
        printf("\n\nSecond Set :\n");
        print(set2);
        printf("\n\nThird Set :\n");
        print(set3);
        break;
    case 3: Union(set1,set2,set3);print(set3);break;
    case 4: intersection(set1,set2,set3);print(set3);break;
    case 5: difference(set1,set2,set3);print(set3);break;
    case 6: symmdiff(set1,set2,set3);print(set3);break;
     }
  printf("\npress a key............");
  getch();
  }while(op!=7);
 }

 /*creates set[] with initial elements*/

 void create(int set[])
   {   int n,i,x;
       set[0]=0;/*make it a null set*/
       printf("\n No. of elements in the set:");
       scanf("%d",&n);
       printf("\n enter set elements :");
       for(i=1;i<=n;i++)
       scanf("%d",&set[i]);
       set[0]=n; //Number of elements.

   }

 void  print(int set[])
  { int i,n;
    n=set[0];/* number of elements in the set */
    printf("\Members of the set :-->");
    for(i=1;i<=n;i++)
       printf("%d  ",set[i]);
  }

 /* union of  set1[] and set2[] is stored in set3[]*/

void Union(int set1[],int set2[],int set3[])
  { int i,n;
    /* copy set1[] to set3[]*/
    set3[0]=0;/*make set3[] a null set */
    n=set1[0];/* number of elements in the set*/
    //Union of set1,set2= set1 + (set2-set1)
    for(i=0;i<=n;i++)
    set3[i]=set1[i];

    n=set2[0];
    for(i=1;i<=n;i++)
       if(!member(set3,set2[i]))
        set3[++set3[0]]=set2[i];  // insert and increment no. of elements
   }

 /*function returns 1 or 0 depending on whether x belongs
  to set[] or not */

 int member(int set[],int x)
  { int i,n;
    n=set[0]; /* number of elements in the set*/
    for(i=1;i<=n;i++)
      if(x==set[i])
     return(1);

     return(0);
  }

/*intersection of set1[] and set2[] is stored in set3[]*/

void intersection(int set1[],int set2[],int set3[])
     {
    int i,n;
    set3[0]=0; /* make a NULL set*/
    n=set1[0];/* number of elements in the set*/
    for(i=1;i<=n;i++)
      if(member(set2,set1[i])) /* all common elements are inserted in set3[]*/
           set3[++set3[0]]=set1[i];  // insert and increment no. of elements
     }

/*difference of set1[] and set2[] is stored in set3[]*/

void difference(int set1[],int set2[],int set3[])
      { int i,n;
    n=set1[0];/* number of elements in the set*/
    set3[0]=0;/*make it a null set*/
    for(i=1;i<=n;i++)
       if(!member(set2,set1[i]))
         set3[++set3[0]]=set1[i];  // insert and increment no. of elements
      }

 void symmdiff(int set1[],int set2[],int set3[])
      { int i,n;
    n=set1[0];/* number of elements in the set*/
    set3[0]=0;/*make it a null set*/
    //Calculate set1-set2
    for(i=1;i<=n;i++)
       if(!member(set2,set1[i]))
         set3[++set3[0]]=set1[i];  // insert and increment no. of elements
    //Calculate set2-set1
    n=set2[0];
    for(i=1;i<=n;i++)
       if(!member(set1,set2[i]))
         set3[++set3[0]]=set2[i];  // insert and increment no. of elements

      }
