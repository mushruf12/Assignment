package question1;
interface Square {
    int calculate(int x);
}

public class FInterface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		  
        Square s = (int x) -> x * x;//Lambda Expression
  
        int ans = s.calculate(a);
        System.out.println(ans);
	}

}
