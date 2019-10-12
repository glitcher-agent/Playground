#include<stdio.h>
int createarray(int n,int m)
{
int arr[n],ar[m];
}
void getelements(int n,int m,int *arr,int *ar)
{
  int i,j;
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
  for(j=0;j<m;j++){
  scanf("%d",&ar[j]);
   
  }
  
}
void findsame(int *arr,int *ar)
{
    int a,sum=0,k=0,b,n,m;
    
  for(a=0;a<n; a++)
    {
      sum=sum+arr[a];
    }
  for(b=0;b<m;b++)
    {
      k=k+ar[b];
    }
  if(sum==k && m==n)
  {
    printf("Same");
  }
 else
  {
    printf("Not Same");
  }
}

int main()
{
  int n,m,arr[n],ar[m];
  scanf("%d",&n);
  scanf("%d",&m);
  createarray(n,m);
  getelements(n,m,arr,ar);
  findsame(arr,ar);
  return 0;
}