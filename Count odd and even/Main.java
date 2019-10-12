#include<stdio.h>
void countEven(int size,int * arr)
{
    int i,sum=1,count=0;
    for(i = 0; i < size; i++)
    {
      if(arr[i]%2==0)
      {
        
        sum=sum+count;
        count++;
       
      }
      
    }
  printf("Even: %d\n",sum);
}
void countOdd(int size,int * arr)
{
    int i,d=0,s=0;
    for(i=0; i<size;i++)
    {
      if(arr[i]%2!=0)
      {
        
        d=d+s;
        s++;
      }
    }
  printf("Odd: %d\n",s);
}
int main()
{
    int arr[100],n;
  scanf("%d",&n);
  for(int i = 0; i < n; i++)
    {
        scanf("%d, ", &arr[i]);
    }

  countOdd(n, arr);
  countEven(n,arr);

    return 0;
}