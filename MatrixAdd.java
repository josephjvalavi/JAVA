import java.io.*;
import java.util.Scanner;
class MatrixAdd
{
public static void main (String [] args)
{
int r,c,m,n;
int a[][];
int b[][];
int add[][];
Scanner sc= new Scanner(System.in);
System.out.println("enter the row of first matrix");
r=sc.nextInt();
System.out.println("enter the column of first matrix");
c=sc.nextInt();
System.out.println("enter the row of second matrix");
m=sc.nextInt();
System.out.println("enter the column of second matrix");
n=sc.nextInt();
if(r==m && c==n)
{
a=new int[r][c];
b=new int [m][n];
add=new int [r][n];
System.out.println("enter the elelemtss of first matrix");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();
System.out.println("enter the elelemtss of second matrix");
for(int i=0;i<m;i++)
for(int j=0;j<n;j++)
b[i][j]=sc.nextInt();
for(int i=0;i<r;i++)
for(int j=0;j<n;j++)
add[i][j]=a[i][j]+b[i][j];
System.out.println("added  the elelemtss of 2 matrix");
for(int i=0;i<r;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(add[i][j]+" ");
}
System.out.println();
}
}
else

System.out.println("addition is not possible ");
}
}




