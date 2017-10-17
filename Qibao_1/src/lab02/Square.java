package lab02;

public class Square extends Shape {
	public Square(double with, double height) {
		super();
		this.with = with;
		this.height = height;
	}
	public double with,height;

	@Override
	public void perameter() {
		// TODO Auto-generated method stub
		//super.perameter();
		System.out.println("Parameter is " + 2*(with+height));
	}

	@Override
	public void areas() {
		// TODO Auto-generated method stub
		//super.areas();
		System.out.println("Area is " + with*height);
	}
	public void cha(){
		System.out.println("Cha is " + (with-height));
	}

}
