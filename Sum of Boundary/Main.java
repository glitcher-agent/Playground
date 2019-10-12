
#include<stdio.h>
#include<stdlib.h>
int main()
{
 int row,col,**a,sum=0,i,j;
  scanf("%d\n%d\n",&row,&col);
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
    sum+=*(*(a+0)+i);
    sum+=*(*(a+(row-1))+i);
  }
  for(i=1;i<row-1;i++)
  {
    sum+=*(*(a+i)+0);
    sum+=*(*(a+(i))+(col-1));
  }
  printf("Sum of boundaries is %d",sum);
  return 0;
           
  
}

