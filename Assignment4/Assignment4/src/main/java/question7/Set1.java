package question7;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set1.forEach(num->System.out.println(num));
		

	}

}
