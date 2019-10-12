void print(int size,int * arr)
{
    int i;
    for(i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
}

int main()
{
    int arr[100],n;
  scanf("%d",&n);
  for(int i = 0; i < n; i++)
    {
        scanf("%d, ", &arr[i]);
    }

    print(n, arr);

    return 0;
}