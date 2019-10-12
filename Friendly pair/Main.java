#include<stdio.h>
int main()
{
  int a,b,c=0,d=0,j;
  scanf("%d %d",&a,&b);
  for(int i=1;i<a;i++)
  {
  
    if(a%i==0)
    {
      c=c+i;     
    }
  }
    for(j=1;j<b;j++)
  {
  
    if(b%j==0)
    {
      d=d+j;     
    }
      
  }
    if((c/a)==(d/b))
    {
    printf("Friendly Pair");
      
    }
    else{
    printf("Not Friendly Pair");
    }
  
}
