


#include<stdio.h>
void main()
{
struct student
{
int rollno;
int m1,m2,m3,m4,m5;
float avg;
};
struct student s[20],t;
int i,j,n;
scanf("%d",&n);
  printf("STUDENT MARKSHEET USING STRUCTURES\n");
printf("Enter the no of students\n\n");
for(i=0;i<n;i++)
{
scanf("%d",&s[i].rollno);
scanf("%d",&s[i].m1);
scanf("%d",&s[i].m2);
scanf("%d",&s[i].m3);
scanf("%d",&s[i].m4);
scanf("%d",&s[i].m5);
s[i].avg=(s[i].m1+s[i].m2+s[i].m3+s[i].m4+s[i].m5)/5;
}
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(s[i].avg<s[j].avg)
{
t=s[i];
s[i]=s[j];
s[j]=t;
}
}
}
printf("rn s1 s2 s3 s4 s5 avg grade\n\n");

for(i=0;i<n;i++)
{
printf("%d ",s[i].rollno);
printf("%d ",s[i].m1);
printf("%d ",s[i].m2);
printf("%d ",s[i].m3);
printf("%d ",s[i].m4);
printf("%d ",s[i].m5);
printf("%0.2f ",s[i].avg);
if(s[i].avg>70)
{
    printf("1");
  }
   else{
     printf("2");
}
 printf("\n");
 }
}

