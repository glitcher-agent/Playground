#include <stdio.h>
int main() {
int a,b,c=0;
  scanf("%d",&a);
  while(a!=0)
  {
    if(a%2==1)
    
      c++;
    a=a/2;
    
  }
  printf("%d",c);
}