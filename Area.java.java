package graphics;
public class Area
{
public static void main(String args[])
	{
		Square sq=new Square();
		Rectangle r=new Rectangle();
		Triangle t=new Triangle();
		Circle c=new Circle();
		System.out.println("Area of square: "+sq.area(5,0));
		System.out.println("Area of rectangle: "+r.area(3,5));
		System.out.println("Area of triangle: "+t.area(4,8));
		System.out.println("Area of circle: "+c.area(5,0));
	}
}
   