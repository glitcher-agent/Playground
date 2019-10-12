#include<stdio.h>
int main()
{
 int n,fact=1;
  scanf("%d",&n);
  if(n<0){
  
  }
  else{
  for(int i=1;i<=n;++i)
  {
    fact=fact*i;
  }
  printf("%d",fact);
}
}