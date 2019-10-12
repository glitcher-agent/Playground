#include<stdio.h>
int main()
{
  int row,col,**a,i,j,sum=0;
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
  for(i=0;i<col;i++)
  {
    sum+=*(*(a+0)+i);
    sum+=*(*(a+(row-1))+i);
  }
  for(i=1;i<col-1;i++)
  {
    sum+=*(*(a+i)+i);
  }
  printf("Sum of Zig-Zag pattern is %d",sum);

}



