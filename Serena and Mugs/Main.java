#include<stdio.h>
int main()
{
  int ar[100],i,sum=0,n,s;
  scanf("%d%d",&n,&s);
  for(i=0;i<n;i++)
  {
  scanf("%d",&ar[i]);
    sum=sum+ar[i];
  }
  if(sum<s)
  {
    printf("YES\n");
    
  }
  else
  {
    printf("NO\n");
  }
  
  
}