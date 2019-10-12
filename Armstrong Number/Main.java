#include<stdio.h>
int main()
{
  int a,rem,sum=0,n;
  scanf("%d",&a);
  n=a;
  while(a!=0)
  {
    rem=a%10;
    sum=sum+rem*rem*rem;
    a=a/10;
  }

  if(n==sum)
  {
    printf("Armstrong Number");
  }
  else{
  printf("Not Armstrong Number");
  }
}