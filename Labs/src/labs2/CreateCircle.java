package labs2;

public class CreateCircle {
	//define all variables needed
	double circumference=0;
	double diameter=0;
	double radius=0;
	double area=0;
	double pie=3.14;
			
			

	
	public void findCircumference(double inputRadius) {
	
	
		circumference=(2*pie*inputRadius);
		radius=inputRadius;
		
	}
		
	public void findDiameter(double inputRadius) {
		diameter=inputRadius*2;
		radius=inputRadius;
	}
	
	public void findArea(double inputRadius) {
		double rSquared;
		
		rSquared=Math.pow(inputRadius, 2);
		
		area=pie*rSquared;
		
	}
}
