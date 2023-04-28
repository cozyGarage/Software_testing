package Calculator;

public class Calc {
	public  int add(int a, int b)
	{
		return a+b;
	}
	
	public  int sub(int a, int b)
	{
		return a-b;
	}
	
	 public int calculateRectangleArea(int a, int b) {
	        if (a <= 0 || b <= 0) {
	            throw new IllegalArgumentException("Error: height and width must be positive");
	        }
	        return a * b;
	 }
	 
	 public double calculateCircleCircumference(double diameter) {
	        if (diameter <= 0) {
	            return 0;
	        }
	        return Math.PI * diameter;
	    }
}
