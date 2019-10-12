#include<stdio.h>
int main()
{
  int a,rem=0,ri=0,n;
  scanf("%d",&a);
  n=a;
  while( a!=0 )
    {
        rem=a%10;
        ri=ri*10+rem;
        a =a/10;
    }
  if(n==ri)
  {
    printf("Same");
  }
  else
  {
    printf("Not Same");
  }
}