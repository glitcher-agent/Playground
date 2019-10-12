#include<stdio.h>
#include<stdlib.h>
int main()
{
  int **a,i,j,sum=0,row,col,*rsum,*csum,max;
    scanf("%d\n%d",&row,&col);
  a=(int **)malloc(row*sizeof(int));
  rsum=(int *)malloc(row*sizeof(int));
  csum=(int *)malloc(col*sizeof(int));
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
  printf("Sum of rows is ");
   for(i=0;i<row;i++)
  {
    for(j=0;j<col;j++)
    {
      *(rsum+i)+=*(*(a+i)+j);
    }
    printf("%d ",*(rsum+i));
   
  }
  max=0;
 for(i=0;i<row;i++)
 {
   if(*(rsum+i)>*(rsum+max))
   {
     max=i;
   }
 }
 printf("\nRow %d has maximum sum",max+1);
 printf("\nSum of columns is ");
   for(i=0;i<col;i++)
  {
    for(j=0;j<row;j++)
    {
      *(csum+i)+=*(*(a+j)+i);
    }
    printf("%d ",*(csum+i));
   
  }
  max=0;
  for(i=0;i<row;i++)
  {
    if(*(csum+i)>*(csum+max))
    {
      max=i;
    }
  }
  printf("\nColumn %d has maximum sum",max+1);
  
           
             
  return 0;
}

