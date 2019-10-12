#include<stdio.h>
int main()
{
 char str1[100],str2[100];
  scanf("%s %s",str1,str2);
  if(strcmp(str1,str2)==0)
  {
    printf("Strings are same");
  }
  else
  {
    printf("Strings are not same");
  }
}