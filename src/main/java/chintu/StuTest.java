package chintu;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

import com.bp.abc.Employee;

import chintu.Student;

public class StuTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		
		//if two objects are equal.
		if (s5==s6) {
			System.out.println("equals:");
		} else {
			System.out.println("not equels:");
		}
		
		if (s5.equals(s6)) {
			System.out.println("equals:");
		} else {
			System.out.println("not equels:");
		}

//using vectors
		Vector<Student> ve = new Vector<Student>();
		ve.add(s1);
		ve.add(s2);
		ve.add(s3);
		ve.add(s4);
		ve.add(s5);
		ve.add(s6);
		ve.add(new Student ("raj","pillai",20,"i6",94));
		
//		System.out.println("vector size:" +ve.size());
//		System.out.println();
//		System.out.println("vector capacity:" +ve.capacity());
//		System.out.println();
	 	
//		Enumeration <Student> en = ve.elements();
//	 	while (en.hasMoreElements()) {
//			Student student = (Student) en.nextElement();
//			student.studetails();
//		}
	 	for(Student student : ve) {
	 		student.studetails();
	 	}	 		
//	 	
//using hashTable.
	 	Hashtable <Integer, Vector<String>> hash = new Hashtable <Integer, Vector<String>>();
	 	Vector<String> vt = new Vector<String>();
	 	vt.add("raja");
	 	vt.add("rani");
	 	vt.add("vani");
	 	vt.add("ram");
	 	
	 	for (String string : vt) {
	 		System.out.println("student fNames:" +string);	
		}
		
//using arraylist.
	 	
	 	

//using linkedlist.
	 	

//using hashset.
	 	
	 	
//using treeset.
	 
	}
}

