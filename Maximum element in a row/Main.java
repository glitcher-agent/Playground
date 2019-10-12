#include<stdio.h>
#include<stdlib.h>
int main()
{
  int **a,max,i,j,row,col;
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
    max=*(*(a+i)+0);
    for(j=0;j<col;j++)
    {
      if((*(*(a+i)+j))>max)
      {
        max=*(*(a+i)+j);
      }
    }
    printf("%d\n",max);
  }
  return 0;
}    
