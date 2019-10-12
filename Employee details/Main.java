

#include <stdio.h>
union employee{
    char    name[30];
  //  int     empId;
    int   salary;
};
 
int main()
{
  union employee emp;
     printf("Enter the Employee details\n");
    printf("Enter the Employee name\n");         
scanf ("%s ",emp.name);
    printf("Enter the Employee salary\n");        
  scanf("%d",&emp.salary);
      printf("\nEmployee Details\n");
    printf("%s  ",emp.name);
    printf("%d\n",emp.salary);
    return 0;
}