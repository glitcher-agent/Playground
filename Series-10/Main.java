#include<stdio.h>
int main()
{
  int a,b,c,k=0,s,count=0;
  printf("Enter n value\n");
  scanf("%d",&a);

  for(int i=0;i<10;i++)
  {
    s=k+(2*i);
    k=s;
    count++;
    if(count<=a)
    {
    printf("%d ",k);
    }
  }
}