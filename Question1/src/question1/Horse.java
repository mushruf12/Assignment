package question1;

public class Horse extends Animal {

	@Override
	void walk() {
		// TODO Auto-generated method stub
		System.out.println("Horse walks on Land");
		
	}

	@Override
	void type() {
		// TODO Auto-generated method stub
		System.out.println("Herbivoures");
		
	}

	@Override
	void fly() {
		// TODO Auto-generated method stub
		System.out.println("Horse Cant Fly");

		
	}
	
	public static void main(String args[]) {
		Horse h1=new Horse();
		h1.walk();
		h1.type();
		h1.fly();
		
	}
	
	

}
