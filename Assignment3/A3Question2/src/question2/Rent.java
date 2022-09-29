package question2;

public class Rent extends Apartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rent r = new Rent();
		System.out.println(r.onebhk());
		System.out.println(r.deluxe());
		System.out.println(r.villa());
	}

	@Override
	int onebhk() {
		// TODO Auto-generated method stub
		System.out.print("Onebhk ");
		return 5000;
	}

	@Override
	int deluxe() {
		// TODO Auto-generated method stub
		System.out.print("Deluxe ");
		return 15000;
	}

	@Override
	int villa() {
		// TODO Auto-generated method stub
		System.out.print("Villa ");
		return 20000;
	}

}
