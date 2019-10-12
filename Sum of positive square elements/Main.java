#include<stdio.h>
#include<math.h>

void sumPositive(int size,int * arr)
{
    int i,d;
  float s;
    for(i = 0; i < size; i++)
    {
      s=sqrt(arr[i]);
      d=s;
      if(s==d)
      {
        printf("%d",arr[i]);
      }
    }  
}

int main()
{
   int n,arr[100];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {

    scanf("%d",&arr[i]); 
  }
  sumPositive(n,arr);
}