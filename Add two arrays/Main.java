#include<stdio.h>
int createarray(int n)
{
int arr[n],ar[n];
}
void getelements(int n,int *arr,int *ar)
{
  int i,j;
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  for(j=0;j<n;j++){
  scanf("%d",&ar[j]);
   
  }
  
}
void sum(int n,int *arr,int *ar)
{
    int i,sum[n];
  for(i=0;i<n;i++)
    {
    sum[i]=arr[i]+ar[i];
    printf("%d ",sum[i]);
    }
 
}

int main()
{
  int n;
  scanf("%d",&n);
  int arr[n],ar[n];
  createarray(n);
  getelements(n,arr,ar);
  sum(n,arr,ar);
  return 0;
}