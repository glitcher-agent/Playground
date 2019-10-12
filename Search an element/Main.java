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
int search(int n,int *arr,int f){
       
     for(int i=0;i<=n;i++){
        if(arr[i]==f){
          printf("%d is present in the array",f);
          break;
        }
         else
         {
            printf("%d is not present in the array",f);
           break;
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
  scanf("%d",&f);
 search(n,arr,f);

  
  
  
}