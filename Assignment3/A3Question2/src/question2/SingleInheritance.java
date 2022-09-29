package question2;
class SInheritance1 extends BaseClass{
	void disp1() {
		System.out.print("Derived class (Single Inhertitance)");
	}
	void disp2() {
		System.out.print("Derived class (Base Class)->");
		
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SInheritance1 s1 = new SInheritance1();
		s1.disp();
		s1.disp1();

	}

}
