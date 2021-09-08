package Graphics;
interface Graphics
{	final static float pi=3.14;
	public float area(float a,float b);
}
class Square implements Graphics
{
	public float area(float a,float b)
	{
		return(a*a);
	}
}
class Rectangle implements Graphics
{
	public float area(float a,float b)
	{
		return(a*b);
	}
}
class Triangle implements Graphics
{
	public float area(float a,float b)
	{
		return((a*b)/2);
	}
}
class Circle implements Graphics
{
	public float area(float a,float b)
	{
		return(pi*a*a);
	}
}