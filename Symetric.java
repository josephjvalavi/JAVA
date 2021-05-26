import java.io.*;
import java.util.Scanner;
class Symetric
{
public static void main(String [] args)
{
int r,c;
int flag=0;
int a[][];
Scanner sc= new Scanner(System.in);
System.out.println("enter the row of  matrix");
r=sc.nextInt();
System.out.println("enter the column of  matrix");
c=sc.nextInt();
a= new int[r][c];
System.out.println("enter the matrix elements");
for(int i=0;i<r;i++)
for(int j=0;j<c;j++)
a[i][j]=sc.nextInt();
System.out.println("matrix is");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a [i][j] +" ");
}
System.out.println();
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
if(a[i][j]!=a[j][i])
{
	flag++;
}
}
}

if(flag==0)
{
System.out.println("matrix is   symetric");
}
else
{
System.out.println("matrix is not symetric");
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(a[j][i]+" ");
}
System.out.println();
}

}

}