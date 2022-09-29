package question2;
class Deri1 extends BaseClass{
	void dis2() {
		System.out.println("  Derived - 2  ");
	}
}

public class Derived2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deri1 d = new Deri1();
		d.dis();
		d.dis2();

	}

}
