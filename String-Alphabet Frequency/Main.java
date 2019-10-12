#include<stdio.h>
int main()
{
   char str[10],temp;
  int i,j,k,c=1;
  scanf("%s",str);
  for(i=0;str[i]!='\0';i++)
  {
    for(j=i+1;str[j]!='\0';j++)
    {
      if(str[i]>str[j])
      {
        temp=str[i];
        str[i]=str[j];
        str[j]=temp;
      }
    }
  }

  for(i=0;str[i]!='\0';i++)
  {
    for(j=i+1;str[j]!='\0';j++)
    {
      if(str[i]==str[j])
      {
        c+=1;
        for(k=j;str[k]!='\0';k++)
        {
          str[k]=str[k+1];
        }
      }
  
  }
    printf("%c %d\n",str[i],c);
    c=1;
  }
  
 
  return 0;
}

