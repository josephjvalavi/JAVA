import java.io.*;
import java.util.Scanner;

class Person{

Scanner sc=new Scanner(System.in);

String name,gender,adress;
int age;
     Person()
{
name=" ";
gender=" ";
adress=" ";
age=0;
}
 void read ()
{
System.out.println("enter the name of the person");
name=sc.nextLine();
System.out.println("enter the gender of the person");
gender=sc.nextLine();
System.out.println("enter the adress of the person");
adress=sc.nextLine();
System.out.println("enter the age of the person");
age=sc.nextInt();
}
void display()
{
System.out.println(" name of the person:"+name);
System.out.println("gender of the person:"+gender);
System.out.println("adress of the person:"+adress);
System.out.println("age of the person:"+age);
}
}

 class Employee extends Person
{
Scanner sc=new Scanner(System.in);

 String empid;
 String cname;
 int salary;
 String qualif;
 Employee()
 {
 empid=" ";
 cname=" ";
 salary=0;
 qualif=" ";
 }
void read()
{
super.read();
 System.out.println(" Enter empid");
 empid=sc.nextLine();
 System.out.println(" Enter company name");
 cname=sc.nextLine();
 System.out.println(" Enter salary");
 salary=sc.nextInt();
 System.out.println(" Enter qualification");
 qualif=sc.next();
}
void display()
{
super.display();
System.out.println("Id : "+empid);
 System.out.println("companyName :"+cname);
 System.out.println("Salary :"+salary);
 System.out.println("qualifiacation :"+qualif);
}
 
}
 class Teacher extends Employee
{
Scanner sc=new Scanner(System.in);

 String dept;
 String subject;
	int teacherid;
 Teacher()
 {
 dept=" ";
 subject=" ";
teacherid=0;
 }

	void read()
 {
 
super.read();

System.out.println(" Enter teacher id");
teacherid=sc.nextInt();
 System.out.println(" Enter dept name");
 dept=sc.next();
 System.out.println(" Enter subject name");
 subject=sc.next();

 }

	 void display()
 {
System.out.println("__________________________________________");
 super.display();
System.out.println("teacher id :"+ teacherid);
 System.out.println("Department :"+dept);
 System.out.println("Subject taught :"+subject);

 }
}
							class Persons
							{
								public static void main(String args[])
								{
									Scanner sc=new Scanner(System.in);
								int n;
								System.out.println("enter the number of persons");
								n=sc.nextInt();
									Teacher t[]=new Teacher[n];
								for(int i=0;i<n;i++)
								{
									t[i]=new Teacher();
									t[i].read();
								}	
								for(int i=0;i<n;i++)
								{
									t[i].display();	
								}
								}
							}

