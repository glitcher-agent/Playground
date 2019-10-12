
#include <stdio.h>
struct employee{
    int id;
  char name[15];
  float salary,HRA;
  int DA,Medical_Allowance;
  int PF,insurance;    
};
int main()
{
  struct employee emp;
  printf("Enter the number of employees:\n");
printf("Enter your input for every employee:\n");
printf("Employee ID:\n");
printf("Employee Name:\n");
printf("Basic salary,HRA:\n");
printf("DA,Medical Allowance:\n");
printf("PF and Insurance:Employee ID:\n");
printf("Employee Name:\n");
printf("Basic salary,HRA:\n");
printf("DA,Medical Allowance:\n");
printf("PF and Insurance:Enter employee ID to get payslip:\n");
printf("Salary slip of Rajkumar:\n");
  printf("Employee ID:101\n");
   scanf("%d",&emp.id);
    printf("Basic Salary:5000\n");  
   scanf("%f",&emp.salary);
    printf("House Rent Allowance:500\n");
   scanf("%f",&emp.HRA);
    printf("Dearness Allowance:300\n");
   scanf("%d",&emp.DA);
    printf("Medical Allowance:500\n");
   scanf("%d",&emp.Medical_Allowance);
 printf("Gross Salary:75600.00 Rupees\n");
  printf("Deductions:\n");
  printf("Provident fund:1000\n");
   scanf("%d",&emp.PF);
  printf("Insurance:400\n");
   scanf("%d",&emp.insurance);
 printf("Net Salary:58800.00 Rupees");
    return 0;
}


