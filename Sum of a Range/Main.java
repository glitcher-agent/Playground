#include<stdio.h>
int main()
{
  int a,b,c=0;
  scanf("%d\n %d",&a,&b);
  while(a<=b)
  {
    c=c+a;
    a++;
    
    
  }
  printf("%d",c);  
}