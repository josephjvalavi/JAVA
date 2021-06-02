import java.util.Scanner;
class ArraySearch
{
public static void main(String arg[])
{
int i,n,s,flag=0;
Scanner sc=new Scanner(System.in);
System.out.print("enter the size");
n=sc.nextInt();
int a[]=new int [n];
System.out.print("enter the elements");
for ( i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.print("enter the element to search");
s=sc.nextInt();
for ( i=0;i<n;i++)

if(s==a[i])
{
flag=1;

}
else
{
flag=0;
}
if(flag==0)
{
System.out.print("element is presnt at"+i+"position");

}

else
{
System.out.print("element is not presnt");
}
}
}