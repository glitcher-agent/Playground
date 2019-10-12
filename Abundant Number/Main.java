#include<stdio.h>
int main()
{
  int a,b,c,i;
  scanf("%d",&a);
 for(i=1;i<a;i++)
 {
   if(a%i==0)
   {
     c=c+i;
   }
 }
  if(a<c)
  {
    printf("Abundant Number");
  }
  else 
  {
    printf("Not Abundant Number");
  }
}