package question1;

public class Multiplication implements FInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=10;
		
		Multiplication m = new Multiplication();
		System.out.println(m.mul(a,b));
		System.out.println(m.add(a,b));
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
