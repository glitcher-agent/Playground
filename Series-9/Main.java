#include<stdio.h>
#include<math.h>
int main()
{
  int a,c,d,i;
  printf("Enter n value");
  scanf("%d",&a);
  for(i=1;i<=a;i++)
  {
    if(i%2==0)
    {
    c=pow(i,2);
    printf("%d ",c);
    }
    else
    {
      c=pow(i,3);
        printf("%d ",c);
    }
      }
 
    
  
  }