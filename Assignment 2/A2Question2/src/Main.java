
public class Main implements Animal{
	@Override
	public void dog() {
		// TODO Auto-generated method stub
		System.out.println("Bow Bow");
		
	}

	@Override
	public void cat() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meow");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main sound = new Main();
		sound.dog();
		sound.cat();

	}

	

}
