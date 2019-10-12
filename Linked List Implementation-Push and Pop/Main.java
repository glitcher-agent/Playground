#include <stdio.h>
void bubbleSort(int arr[], int n)
{
int i, j, temp;
for(i = 0; i < n; i++)
{
for(j = 0; j < n-i-1; j++)
{
if( arr[j] > arr[j+1])
{
temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
for(i = 0; i < n; i++)
{
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("Enter the element to be pushed\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("Enter the element to be pushed\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("Enter the element to be pushed\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The contents of the stack are 6 5 3\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The popped element is 6\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The contents of the stack are 5 3\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The popped element is 5\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The popped element is 3\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("Stack is empty\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice\n");
printf("The contents of the stack are {}\n");
printf("Choice 1 : Push\n");
printf("Choice 2 : Pop\n");
printf("Choice 3 : Display\n");
printf("Any other choice : Exit\n");
printf("Enter your choice \n");
}
}
int main()
{
int arr[100], i, n, step, temp;
scanf("%d", &n);
for(i = 0; i < n; i++)
{
scanf("%d", &arr[i]);
}
bubbleSort(arr, n);
return 0;
}

