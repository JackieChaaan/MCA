#include<stdio.h>
#include<conio.h>
void main()
{
    int array[10], pos, i, limit, item;
    clrscr();
    printf("Enter number of elements in the array\n");
    scanf("%d", &limit);

    printf("Enter %d elements\n", limit);

    for (i = 0; i < limit; i++)
	scanf("%d", &array[i]);

    printf("Please enter the location where you want to insert an new element\n");
    scanf("%d", &pos);

    printf("Please enter the value\n");
    scanf("%d", &item);

    for (i = limit - 1; i >= pos - 1; i--)
	array[i+1] = array[i];

    array[pos-1] = item;

    printf("Resultant array is\n");

    for (i = 0; i <= limit; i++)
	printf("%d\n", array[i]);
    getch();
}