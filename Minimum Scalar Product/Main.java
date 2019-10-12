#include<stdio.h>
int createarray(int n){
 int arr[n],ar[n];
}
 void getelements(int n,int *arr)
{
  int i;
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
 }
int ascending(int *arr,int n)
{
  int i,j,temp;
  for(i=0;i<n-1;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(arr[j]>arr[j+1]){
      temp = arr[j];
     arr[j] = arr[j+1];
      arr[j+1] = temp;
      }
   
}
 }
}
int des(int *ar,int n)
{
  int i,j,a;
   for(i=0;i<n-1;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(ar[j]<ar[j+1]){
      a = ar[j];
     ar[j] = ar[j+1];
      ar[j+1] = a;
      }
}
   }
}
int minscalar(int n,int *ar,int *arr){
       int i,sum=0;
     for( i=0;i<n;i++){
       sum=sum+(arr[i]*ar[i]);

        }
  printf("%d",sum);
}
       
int main()
{
  int n,pos,f;
  scanf("%d",&n);
  int arr[n],ar[n];
  createarray(n);
  getelements(n,arr);
  getelements(n,ar);
ascending(arr,n);
  des(ar,n);
  minscalar(n,ar,arr);
  
  
 }
