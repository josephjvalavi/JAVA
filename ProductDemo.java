


import java.util.Scanner;
class Product
{
 int pcode;
 String pname;
 int price;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("enter the product code");
pcode=sc.nextInt();
System.out.println("enter the product name");
pname=sc.next();
System.out.println("enter the product price");
price=sc.nextInt();  
  }
 void display()
 {
  
  System.out.println(" Product code is: "+this.pcode);
  System.out.println(" Product name is: "+this.pname);
  System.out.println(" Product price is: "+this.price);
 }
}
class ProductDemo
{
 public static void main(String arg[])
 {
   Product p1=new Product();
   Product p2=new Product();
   Product p3=new Product();
   p1.read();
   p2.read();
   p3.read();
   p1.display();
   p2.display();
   p3.display();
   
 System.out.println("______________________");
System.out.println("the product with lowest price ");
    if((p1.price<p2.price)&&(p1.price<p3.price))
     {
       p1.display();
      }
    else if((p2.price<p1.price)&&(p2.price<p3.price))
     {
          p2.display();
     }
   else
     p3.display();

 }
}
   
