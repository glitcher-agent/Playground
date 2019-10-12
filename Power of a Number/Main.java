

#include <stdio.h>
 power(int, int);
 int main()
{
    int pow, num,re;
    scanf("%d", &num);
    scanf("%d", &pow);
    re=power(num,pow);
    printf("%d\n",re);
    return 0;
}

int power(int num, int pow)
{
    if (pow)
    {
        return (num * power(num, pow- 1));
    }
    return 1;
}

