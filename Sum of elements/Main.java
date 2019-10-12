#include<stdio.h>
void sumOfElements(int size,int * arr)
{
    int i,sum=0;
    for(i = 0; i < size; i++)
    {
      sum=sum+arr[i];
    }
     printf("%d",sum);
}
int main()
{
    int arr[100],n;
  scanf("%d",&n);
  for(int i = 0; i < n; i++)
    {
        scanf("%d, ", &arr[i]);
    }
  sumOfElements(n,arr);
    return 0;
}
  