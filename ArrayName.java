import java.io.*;
class ArrayName
{
public static void main(String args[]) throws IOException
{
DataInputStream dp=new DataInputStream(System.in);
int n,sum=0;
System.out.println("enter the size");
n=Integer.parseInt(dp.readLine()); 
String a[]= new String [n];
for(int i=0;i<n;i++)
{
System.out.println("enter the name");
a[i]=dp.readLine();
}
for(int i=0;i<n;i++)
{
System.out.println("Name is"+a[i]);
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
if(a[i].compareTo(a[j])>0)

{ String temp=a[i];
 a[i]=a[j];
a[j]=temp;

}
}
for(int i=0;i<n;i++)
System.out.println("Name is"+a[i]);

}
}