#include<stdio.h>
#include<stdlib.h>
int main()
{
  int **a,i,j,sum=0,row,col;
    scanf("%d\n%d",&row,&col);
  a=(int **)malloc(row*sizeof(int));
  for(i=0;i<row;i++)
  {
    *(a+i)=(int *)malloc(col*sizeof(int));
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      scanf("%d ",*(a+i)+j);
    }
  }
  for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      sum+=*(*(a+i)+j);
    }
    printf("The sum of row %d: %d\n",i+1,sum);
    sum=0;
  }
  return 0;
}


