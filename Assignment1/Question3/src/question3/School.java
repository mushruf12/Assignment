package question3;

public class School {

	int classNo;
	int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	//constructor1
	public School() {
		
	}
	//constructor2
	public School(int height)
	{
		this.classNo=height;
	}
	//constructor3
	public School(int classNo,int marks)
	{
		this.classNo=classNo;
		this.marks=marks;
	}

void disp()
{
	System.out.println("Class Number is "+ classNo +"th");
	System.out.println("Marks are "+ marks + "%");
}
@SuppressWarnings("unused")
public static void main(String[] args) {
	School obj1 = new School(4,72); //obj1
	School obj2 = new School(10,51); //obj2
	School obj3 = new School(9,83); //obj3
	School obj4 = new School(11,95); //obj4
	School obj5  = new School(8,100); //obj5
   
	obj1.disp();
	obj2.disp();
	obj3.disp();
	obj4.disp();
	obj5.disp();
	
}
}
