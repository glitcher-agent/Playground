#include<stdio.h>
int main()
{
  int a,b=0,c=1,d;
  scanf("%d",&a);
 for(int i=0;i<a;i++){
   d=b+c;
   b=c;
   c=d;
   if(c==a)
   {
     printf("Fibonacci Number");
     return 0;
   }
 }
  printf("Not Fibonacci Number");
}
