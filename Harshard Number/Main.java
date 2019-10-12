#include<stdio.h>
int main()
{
 int a,b=0,c=0,d;
  scanf("%d",&a);
  d=a;
  while(a>0){
  b=a%10;
  c=c+b;
  a=a/10;
  }
  if(d%c==0)
  {
    
    printf("Harshard Number");
 
  }
else{
    printf("Not Harshard Number");
}

}