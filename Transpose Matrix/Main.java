#include<stdio.h>
int main()
{
    int a[10][10], transpose[10][10], r,i,j;
    scanf("%d", &r);
       for(i=0; i<r; ++i){
        for(j=0; j<r; ++j)
        {
         
            scanf("%d", &a[i][j]);
        }
}

   for(i=0; i<r; i++){
        for(j=0; j<r; j++)
        {
            printf("%d ", a[i][j]);
         
        }
      printf("\n");
   }
     printf("Transpose matrix is :\n");

    for(i=0; i<r; ++i){
        for(j=0; j<r; ++j)
        {
            transpose[j][i] = a[i][j];
        }
    }
        for(i=0; i<r; ++i){
        for(j=0; j<r; ++j)
        {
            printf("%d ",transpose[i][j]);
            
        }
          printf("\n");
        }
}