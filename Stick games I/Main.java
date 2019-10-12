#include<stdio.h>
int print(int n,int m)
{ 
  int res;
  if(n<m)
  {
    res=m;
  }
  else
  {
    res=n;
  }
  if(res%2!=0)
  {
    printf("Arun Gupta");
  }
  else{
    printf("Mani Iyer");
  }
  
}
int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  print(m,n);
}