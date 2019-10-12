#include<stdio.h>
int main()
{
  int n,*d,i,j,sum=1;
    scanf("%d",&n);
  d=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    scanf("%d",d+i);
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<=i;j++)
    {
      if((*(d+j))<(*(d+i)))
      {
           sum+=1;
         
      }
      
    }
    printf("%d\n",sum);
         sum=1;
  }
  return 0;

}