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
int insert(int *arr,int n,int pos,int f){
  int temp=0,c=0;
    if(pos>n)
    {
      printf("Invalid element");
    }
    else{
      temp=arr[pos+1];
       c=arr[pos];
       arr[pos]=f;
      arr[pos+1]=c;
      arr[pos+2]=temp;   
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
  scanf("%d",&f);
  insert(arr,n,pos,f);
  printf("Array after insertion is:\n");
  for(int i=1;i<=n+1;i++){
  printf("%d\n",arr[i]);
  }
  
  
  
}