package question2;

public class Samsung extends Mobile {

	@Override
	String os() {
		// TODO Auto-generated method stub
		System.out.println("Android");
		return null;
	}

	@Override
	int version() {
		// TODO Auto-generated method stub
		System.out.println("12");
		return 0;
	}
	
	public static void main(String args[]) 
	
	{
		Samsung s1 = new Samsung();
		s1.os();
		s1.version();
	}

}
