


import java.util.Scanner;
class Employee
{
 int eNo;
 String ename;
 int salary;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("enter the employee number");
eNo=sc.nextInt();
System.out.println("enter the employee name");
ename=sc.next();
System.out.println("enter the employee salary");
salary=sc.nextInt();  
  }
 void display()
 {
  
  System.out.println(" employee code is: "+this.eNo);
  System.out.println(" employee name is: "+this.ename);
  System.out.println(" employe salary is: "+this.salary);
 }
}
class EmployeeDemo
{

 public static void main(String arg[])
 {
Scanner input= new Scanner(System.in);
   
int i,sr,n,flag=0;
System.out.println("enter the number of employees");
n=input.nextInt(); 

Employee [] Emp=new Employee[n];
for (i =0;i<n;i++)
Emp[i]=new Employee();
System.out.println("enter the employee details");
for(i=0;i<n;i++)
Emp[i].read ();
System.out.println("enter the employee number to search");
sr=input.nextInt();
for(i=0;i<n;i++)
if (Emp[i].eNo==sr)
{
flag=1;

break;
}
if(flag==1)
{
Emp[i].display();
}

else

{
System.out.println("no such employee");
}
}
}








   
