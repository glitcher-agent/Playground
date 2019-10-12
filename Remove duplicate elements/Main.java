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
int duplicate(int n,int *arr){
       int i,j;
     for( i=0;i<n-1;i++){
       for(j=0;j<n;j++){
        if(arr[i]==arr[j+1]){
          
            printf("%d\n",arr[i]);
          
        }
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
 
 duplicate(n,arr);
  
 }