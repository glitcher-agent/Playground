#include<stdio.h>
int createarray(int n){
 int arr[n];
}
 void getelements(int n,int *arr)
{
  int i;
  for(i=0;i<n;i++){
  scanf("%d",&arr[i]);
  }
 }
int distinct(int *arr,int n){
       int sum=0;
     for(int i=0;i<n;i++){
        if(arr[i]!=arr[i+1]){
          sum=sum+1;
        }
        
        }
  printf("There are %d distinct elements in the array.",sum);
  }
int main()
{
  int n,pos,f;
  scanf("%d",&n);
  int arr[n];
  createarray(n);
  getelements(n,arr);
 distinct(arr,n);
}
