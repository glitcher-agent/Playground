#include<stdio.h>
int main()
{
    int m, n, c, d, first[10][10], second[10][10], sub[10][10];
 
       scanf("%d%d", &m, &n);

       for (c = 0; c < m; c++)
          for (d = 0; d < n; d++)
             scanf("%d", &first[c][d]);
  
     
       for (c = 0; c < m; c++)
          for (d = 0 ; d < n; d++)
             scanf("%d", &second[c][d]);
printf("The Result is:\n");
       for (c = 0; c < m; c++) {
          for (d = 0 ; d < n; d++) {
             sub[c][d] = second[c][d]-first[c][d];
             printf("%d ",sub[c][d]);
          }
          printf("\n");
       }
     
       return 0;
}