package lab02;

public class Shape {
	//public double with,height;
	Shape()
	{
		
	}

	public void perameter(){
		
	}
	public void areas(){
		
	}
	public void cha(){
		
	}
	public static void main(String args[]){
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rect(10,10);
		shapes[1] = new Square(14,12);
		shapes[2] = new Cricle(5);
		System.out.print("The Rect's ");
		shapes[0].perameter();
		shapes[0].areas();
		System.out.print("The Square's ");
		shapes[1].perameter();
		shapes[1].areas();
		shapes[1].cha();
		System.out.print("The Cricle's ");
		shapes[2].perameter();
		shapes[2].areas();
		
		
		
	}

}
