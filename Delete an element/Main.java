#include<stdio.h>
int createarray(int n){
 int arr[n];
}
 void getelements(int n,int *arr)
{
  int i;
  for(i=1;i<=n;i++){
  scanf("%d",&arr[i]);
  }
 }
int delete(int *arr,int n,int pos){
  int temp=0,c=0;
    if(pos>n)
    {
      printf("Invalid element");
    }
    else{
      for(int i=pos;i<n+1;i++){
      
       arr[i]=arr[i+1];
      
      }
  }
}
int main()
{
  int n,pos,f;
  scanf("%d",&n);
  int arr[n];
  createarray(n);
  getelements(n,arr);
  scanf("%d",&pos);
 
  delete(arr,n,pos);
  printf("Array after deletion is:\n");
  for(int i=1;i<n;i++){
  printf("%d\n",arr[i]);
  }
  
  
  
}