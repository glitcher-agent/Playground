
#include<stdio.h>
#include<stdlib.h>
int main()
{
  int n,**a,i,j,valid=1;
    scanf("%d",&n);
  a=(int **)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    *(a+i)=(int *)malloc(n*sizeof(int));
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      scanf("%d ",*(a+i)+j);
    }
  }
  for(j=0;j<n-1;j++)
  {
    for(i=j+1;j<n;j++)
    {
      if((*(*(a+i)+j))!=0)
      {
        valid=0;
        break;
      }
    }
  }
  if(valid==1)
  {
    printf("Lower triangular matrix");
  }
  else
    printf("Upper triangular matrix\n");
  return 0;
}


