package question1;

public class Main extends Food{

	@Override
	void add_chili() {
		// TODO Auto-generated method stub
		System.out.println("Chiili Added");
	}

	@Override
	void add_salt() {
		// TODO Auto-generated method stub
		System.out.println("Salt Added");
		
	}
	public static void main() {
		Main m1=new Main();
		m1.add_chili();
		m1.add_salt();
	}

}
