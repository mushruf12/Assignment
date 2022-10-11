package question1;
@FunctionalInterface
public interface FInterface2 {
	
	int mul(int a,int b);
	default int add(int a,int b){
		return a+b;
	}

}
