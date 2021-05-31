package chintu;

import java.util.ArrayList;

import chintu.Student;

public class ArrayListTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		
		ArrayList <Student> arrayList = new ArrayList <Student>(10);
	 	arrayList.add(s6);
	 	arrayList.add(s1);
	 	arrayList.add(s4);
	 	arrayList.add(s2);
	 	arrayList.add(s5);
	 	
	 	Student std = arrayList.get(4);
	 	std.setfName("kumari");
	 	System.out.println("s5 details:" +arrayList.get(4));
	 	arrayList.add(4,s3);
	 	
	 	boolean flag1=arrayList.contains(s2);
	 	if (flag1==true) {
	 		System.out.println("arraylist contains:" +flag1);
	 	}
	 	System.out.println();
	 	
	 	String a = "index of example" ;
	 	int index = a.lastIndexOf('x'); 
	 	System.out.println("last index of 'x':"+index);
	 	
	 	System.out.println("remove s1 details:"+arrayList.remove(s1));
	 	System.out.println("Arraylist elements:"+ arrayList );
	 	System.out.println();
	 	
	}

}
