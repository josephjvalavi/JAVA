import java.util.Scanner;
 class Employee
{
 String empid;
 String name;
 int salary;
 String address;
 Employee()
 {
 empid=" ";
 name=" ";
 salary=0;
 address=" ";
 }
 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter empid");
 empid=sc.nextLine();
 System.out.println(" Enter name");
 name=sc.nextLine();
 System.out.println(" Enter salary");
 salary=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("Id : "+empid);
 System.out.println("Name :"+name);
 System.out.println("Salary :"+salary);
 System.out.println("Address :"+address);
 }
}


 class Teacher extends Employee
{
 String dept;
 String subject;
 Teacher()
 {
 dept="";
 subject="";
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter dept name");
 dept=sc.nextLine();
 System.out.println(" Enter subject name");
 subject=sc.nextLine();
 }
 void display()
 {
System.out.println("__________________________________________");
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject taught :"+subject);
 }
}

class EmployeeTeacher
 {
 public static void main(String args[])
 {
 Scanner sc= new Scanner(System.in);
int n;
System.out.println("enter the number of employees");
n=sc.nextInt();
 Teacher t[]=new Teacher[n];
 for (int i=0; i<n; i++)
 {
 t[i]=new Teacher();
 t[i].read();
 }
 for (int i=0; i<n; i++)
 {
 t[i].display();
 }
}
}