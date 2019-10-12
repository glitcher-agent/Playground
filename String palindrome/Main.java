#include<stdio.h>
int main()
{
  char str[100],str1[100];
  int j;
  scanf("%s",str);
  for(int i=0;i<strlen(str);i++)
  {
    j=strlen(str)-i-1;
    str1[i]=str[j];
    
    
    
  }
 
   if(strcmp(str1,str)==0)
   {
     printf("Palindrome");
   }
  
}