#include<stdio.h>
int main()
{
  int a,i,count,j,g=0;
    scanf("%d",&a);
  for(int i=100;i<200;i++){ 
          
    for( j=2;j<75;j++)
    {   
      count=0;
    if(i%j==0)
    {
      count++;
      break;
    }
           
    }
   
    if(count==0){
      if(g<a)
      {
         printf("%d ",i);
        g++;
      }
  }
    
    }
}
