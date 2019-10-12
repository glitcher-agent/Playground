#include<stdio.h>
#include<string.h>
int main()
{
  char str1[10],str2[10];
  scanf("%s",str1);
  strcpy(str2,str1);
  printf("The copied string is %s.",str2);
  return 0;
}