package question2;

class Deri extends BaseClass{
	void dis1() {
		System.out.println("  Derived - 1  ");
	}
}

public class Derived1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deri d = new Deri();
		d.dis();
		d.dis1();

	}

}
