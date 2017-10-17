package lab02;

public class Cricle extends Shape {
	public double radius;
	public static double pi=3.14;

	public Cricle(double radius) {
		//super();
		this.radius = radius;
	}
	
	@Override
	public void perameter() {
		// TODO Auto-generated method stub
		//super.perameter();
		System.out.println("Parameter is " + (pi*radius*2));
	}

	@Override
	public void areas() {
		// TODO Auto-generated method stub
		//super.areas();
		System.out.println("Area is " + (radius*radius*pi));
	}

	

}
