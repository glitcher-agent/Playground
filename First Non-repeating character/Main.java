

#include<stdio.h>
int main()
{
  char str[10];
  int i,j;
  scanf("%s",str);
  for(i=0;str[i]!='\0';i++)
  {
    for(j=0;str[j]!='\0';j++)
    {
      if(str[i]==str[j])
      {
        if(i!=j)
        {
          break;
        }
      }
    }
    if(j==strlen(str))
    {
      printf("%c",str[i]);
      break;
    }
  }
  if(i==strlen(str))
  {
    printf("All characters are repititive");
  }
  return 0;
    
}




