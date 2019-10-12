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
  for(i=0;i<col;i++)
  {
    max=*(*(a+0)+i);
    for(j=0;j<row;j++)
    {
      if((*(*(a+j)+i))>max)
      {
        max=*(*(a+j)+i);
      }
    }
    printf("%d\n",max);
  }
  return 0;
}



