#include<stdio.h>
int main()
{
  int array[10] = { 5,1,2,3,65,4};
    
    printf("%d", (array, 0, 65));
    return 0;
}

int largest(int list[], int lower, int upper)
{
    int max;
    if (lower == upper)
        return list[lower];
    else
    {
        max = largest(list, lower + 1, upper);
 
        if (list[lower] >= max)
            return list[lower];
        else
            return max;
    }
}
