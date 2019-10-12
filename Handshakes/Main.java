#include<stdio.h>
int main()
{
 int n,b;
  scanf("%d",&n);
  do
  {
  b=(n*(n-1))/2;  
  }while(n==0);
  printf("%d",b);
  
}