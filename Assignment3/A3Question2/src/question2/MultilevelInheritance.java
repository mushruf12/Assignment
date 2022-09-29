package question2;
class Multi extends SInheritance1{
	void disp3() {
		System.out.print("Derived class  (Multilevel Inhertitance)");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi m1 = new Multi();
		m1.disp();
		m1.disp2();
		m1.disp3();

	}

}
