import java.io.*;
import java.util.Scanner;
class OverLoad
{

void calculate(int n,char ch)
{
if (ch == 's')
{
System.out.println("RESULT="+n*n);
}
else
{
System.out.println("RESULT="+n*n*n);
}
}
void calculate(int n,int m,char ch)
{
if(ch=='p')
{
System.out.println("RESULT="+n*m);
}
else
{
System.out.println("RESULT="+n+m);
}
}
void calculate (String str1,String str2)
{
if(str1==str2)
{
System.out.println(" string "+str1 +str2+ "are same");
}
else
{
System.out.println("string "+str1 + str2+ "arenot same");
}
}
}
class OverLoadDemo
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int n,m;
char ch;
String str1,str2;


OverLoad ob=new OverLoad();

System.out.println("enter the integer");
n=sc.nextInt();
System.out.println("enter the charater");
ch=sc.next().charAt(0);
ob.calculate(n,ch);
System.out.println("enter the anotherr integer integer");
m=sc.nextInt();
System.out.println("enter the charater");
ch=sc.next().charAt(0);
ob.calculate(n,m,ch);
System.out.println("enter the  first string");
str1=sc.next();
System.out.println("enter the  2nd string");
str2=sc.next();
ob.calculate(str1,str2);
}
}













