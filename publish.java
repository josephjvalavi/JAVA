import java.io.*;
import java.util.Scanner;

class publisher
{
String name,adress;
int ph;
 
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the publisher name");
		name=sc.nextLine();
		System.out.println("enter the adrees of pulisher");
		adress=sc.nextLine();
		System.out.println("enter the phone number");
			ph=sc.nextInt();
	}

		
	void display()
	{
		
		System.out.println("publisher name:"+name);
		
		System.out.println(" adrees of pulisher:"+adress);
		
		System.out.println(" phone number:"+ph);
	}
}

class Book extends publisher
{
Scanner sc= new Scanner(System.in);
int bookno,price;
String title,auther,cat;
	void read()
	{

	super.read();
 
System.out.println(" Enter the book number:");
 bookno=sc.nextInt();
 System.out.println(" Enter the title:");
 title=sc.next();
 System.out.println(" Enter the name of auther:");
 auther=sc.next();
 System.out.println(" Enter the category of book:");
 cat=sc.next();
 System.out.println(" Enter the price of book:");
 price=sc.nextInt();
}
				void display()
					{
						super.display();
						System.out.println(" book number:"+bookno);
							
 						System.out.println(" title:"+title);

						System.out.println(" auther:"+auther);

						 System.out.println(" category of book:"+cat);
 
						 System.out.println(" price of book:"+price);

					}
}

class Publish
{
public  static void main (String arg[])
{
Scanner sc=new Scanner(System.in);
int n,i;
String c;
System.out.println("enter the number of books");
n=sc.nextInt();
Book b[]=new Book[n];
for(i=0;i<n;i++)

	{
		b[i]=new Book();
		b[i].read();
	}

System.out.println("enter the cotogory of book to select");
c=sc.next();
int flag=0;
	for(i=0;i<n;i++)
	{
	   if(c.equals(b[i].cat))
		{
			System.out.println("----------------------------");

			System.out.println("BOOK DETAILS");
			System.out.println("__________________________________");
				b[i].display();
					flag=1;
		}
	   else
		continue;
	}
if (flag==0)
System.out.println("no book of this cataogory:"+c);
}
}


