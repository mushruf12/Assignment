package question6;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("e");
		list2.add("f");
		list2.add("a");
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("a");
		list3.add("g");
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("h");
		list4.add("i");
		list4.add("i");
		list4.add("a");
		list4.add("k");
		list4.add("l");
		ArrayList<String> list5 = new ArrayList<String>();
		list5.add("m");
		list5.add("n");
		list5.add("a");
		System.out.println("Finding Common Elemnt");
		for(int i = 0 ; i<list1.size();i++)
		{
			for(int j =0 ;j<list2.size();j++) {
				if(list1.get(i)==list2.get(j)) 
				{
					System.out.println("The Postion in");
					System.out.println("List1 is "+i);
					System.out.println("List2 is "+j);

				}
			}
			for(int j =0 ;j<list3.size();j++) {
				if(list1.get(i)==list3.get(j)) 
				{						
					System.out.println("List3 is "+j);
				}

				}
			for(int j =0 ;j<list4.size();j++) {
				if(list1.get(i)==list4.get(j)) 
				{						
					System.out.println("List4 is "+j);
				}

				}
			for(int j =0 ;j<list5.size();j++) {
				if(list1.get(i)==list5.get(j)) 
				{						
					System.out.println("List5 is "+j);
				}

				}


		}





	}

}
