package question5;

public class Joker implements Interface {
	
	Joker(){
		
	}
	Joker(String a,String b){
		Joker n = new Joker();
	n.dance(a,b);	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Joker j1 = new Joker();
		Joker j2 = new Joker();
		Joker j3 = new Joker();
		Joker j4 = new Joker();
		Joker j5 = new Joker();
		Joker j6 = new Joker();
		Joker j7 = new Joker();
		Joker j8 = new Joker();
		Joker j9 = new Joker("Joker9","Bharatanatyam");
		Joker j10 = new Joker("Joker10","Ghumar");
		Joker j11 = new Joker("Joker11","Hip Hop");
		Joker j12= new Joker("Joker12","Folk");
		Joker j13 = new Joker("Joker13","Ballet");
		Joker j14 = new Joker("Joker14","Classic");
		Joker j15 = new Joker("Joker15","Kuchupudi");
		Joker j16  = new Joker("Joker16","Odiya");
		
	}

}
