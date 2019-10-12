
#include <stdio.h>
struct details
{
 char name[30];
 int ID[5];
 int age;
 char Designation[500];
 int Salary;
};
int main()
{
 struct details detail;
 printf("Enter name:");
 scanf("%s",&detail.name);
 printf("\nEnter ID:");
 scanf("%s",&detail.ID);
 printf("\nEnter age:");
 scanf("%d",&detail.age);
 printf("\nEnter designation:");
 scanf("%s",&detail.Designation);
 printf("\nEnter Salary:");
 scanf("%d",&detail.Salary);
 printf("\nEmployee Details\n");
 printf("Name of the Employee:%s \n",detail.name);
 printf("ID of the Employee:%s \n",detail.ID);
 printf("Age of the Employee:%d \n",detail.age);
 printf("Designation of the employee:%s \n",detail.Designation);
 printf("Salary of the Employee:%d",detail.Salary);
}





