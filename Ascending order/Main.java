#include<stdio.h>
void sort(int n,int *arr)
{
  int i,temp,j;
  for(i=0;i<n;i++)
  {
     for(j=i+1;j<n;j++)
     {
      if(arr[i]>arr[j])
      {
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    
}
}
}
int main()
{
  int arr[100],n,i;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  sort(n,arr);
  printf("Sorted array is:\n");
  for(i=0;i<n;i++)
  {
  printf("%d\n",arr[i]);
  }
}