#include<stdio.h>
int main()
{
 int a,b,res;
  scanf("%d %d",&a,&b);
  for(int i=1;i<=b;i++){
  res=a*i;
    printf("%d * %d = %d\n",a,i,res);
  }
}