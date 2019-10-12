#include<stdio.h>
void maximum(int size,int * arr)
{
    int i ,b,temp;
  temp=arr[0];
    for(i = 0; i < size; i++)
    {
      if(temp<arr[i])
      {
        temp=arr[i];
        
      }
    }
  printf("%d",temp);
}

int main()
{
    int arr[100],n;
  scanf("%d",&n);
  for(int i = 0; i < n; i++)
    {
        scanf("%d, ", &arr[i]);
    }

  maximum(n,arr);

    return 0;
}