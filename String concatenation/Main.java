#include<stdio.h>
#include<string.h>
int main()
{
  char str1[100],str2[100],c[100];
  scanf("%s",str1);
  scanf("%s",str2);
  strcat(str1,str2);
  printf("The concatenated string is %s",str1);
}