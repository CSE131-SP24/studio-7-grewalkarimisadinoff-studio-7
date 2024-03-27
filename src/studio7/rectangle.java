package studio7;

public class rectangle {
	
	private double length; 
	private double width;
	
	public rectangle(double initLength, double initWidth) {
		this.length = initLength; 
		this.width = initWidth;
		
	}
	
	public double area()
	{
		return this.length*this.width;
	}
	
	public double perimeter()
	{
		return ((this.length*2)+(this.width*2)); 
	}
	
	public boolean square ()
	{
		if (this.length == this.width)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public boolean smaller (rectangle a)
	{
		if (this.area () > a.area ()) {
			return true; 
		}
		else 
		{
			return false;
		}
	}
	public void print ()
	{
		System.out.println("area: " + area());
		System.out.println("perimeter: " + perimeter());
		System.out.println("square: " + square ());
		// System.out.println("smaller: " + smaller ()); 
	}
	public static void main (String[] args) {
		rectangle r1 = new rectangle (5, 10);
		r1.print();
		rectangle r2 = new rectangle (6, 6);
		r2.print();
	}

}
