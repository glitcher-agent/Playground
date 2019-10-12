

#include<stdio.h>
int main()
{
  char str[10];
  int a=1,i,sum=0,j,k;
  scanf("%s",str);
  i=0;
 while(str[i]!='\0')
  {
    if(str[i]>='0' && str[i]<='9')
    {
     for(j=i+1;str[j]!='\0';j++)
     {
       if(str[j]>='0' && str[j]<='9')
       {
         a=a*10;
       }
       else
       {
         break;
       }
     }

      if(j==i+1)
      {
        sum+=(str[i]-'0');
      }
      else
      {
        for(k=i;k<j;k++)
        {
          sum+=((str[k]-'0')*a);
          a=a/10;
        }
        i++;
      }
    }
   a=1;
   i++;
 }
  printf("%d",sum);
  return 0;
}
