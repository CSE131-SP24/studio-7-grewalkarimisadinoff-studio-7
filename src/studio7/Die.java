package studio7;

public class Die {
	
	private int sides; 
	
	public Die(int n)
	{
		this.sides = n; 
	}
	
	public int roll() 
	{
		return (int)(Math.random()*this.sides)+1;
	}
	
	public void print ()
	{
		System.out.println("Number: " + roll ());
	}
	
	public static void main (String[] args)
	{
		Die d1 = new Die(24);
		d1.print();
		Die d2 = new Die (5);
		d2.print();
	}
 }
