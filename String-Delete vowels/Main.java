#include<stdio.h>
int main()
{
  char str[10],i,j;
  scanf("%s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]=='a' || 'e' || 'i' || 'o' || 'u')
    {
      for(j=i+1;str[j]!='\0';j++)
      {
        str[j]=str[j+1];
      }
    }
  }
  printf("%s",str);
 
}

