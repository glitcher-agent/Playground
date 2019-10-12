#include<stdio.h>
int main()
{
  int a,b,c,f=0,sum=0,d,count=0;
  float av,avg,k=0;
do
  {
    scanf("%d",&a);
  if(a!=-1){
    
      if(a%2==0){ 
        
        sum=sum+a;
        count++;
        avg=sum/count;
      }
      else
      {
        
        f=f+a;
        k++;
        av=f/k;
      }
  }
  }while(a!=-1);
   printf("%d\n",sum);
  printf("%d\n",f);
   printf("%0.2f\n",avg);
   printf("%0.2f\n",av);
}