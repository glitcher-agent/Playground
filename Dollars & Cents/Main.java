#include<stdio.h>
int main()
{
 int d1,d2,c1,c2,b,c,d;
  
  scanf("%d %d %d %d",&d1,&c1,&d2,&c2);
    
    if(c1+c2>100)
    {
      b=(c1+c2)/100;
      c=b+d1+d2;
      printf("%d\n",c);
      d=(c1+c2)%100;
        printf("%d\n",d);
    }
}