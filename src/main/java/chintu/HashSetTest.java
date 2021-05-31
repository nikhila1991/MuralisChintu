package chintu;

import java.util.HashSet;

import chintu.Student;

public class HashSetTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		Student s7 = new Student("raja", "rani");
		
		HashSet <Student> hset = new HashSet <Student>();
	 	hset.add(s6);
	 	hset.add(s3);
	 	hset.add(new Student ("rani","karuna",25,"abc",98));
	 	hset.add(s4);
	 	hset.add(s1);
	 	hset.add(s2);
	 	hset.add(s5);
	 	System.out.println("hashset size:" +hset.size());
	 	System.out.println("hashset elements:"+ hset );
	 	System.out.println();
	 	
	 	HashSet <Student> hset1 = new HashSet <Student>();
	 	hset1.addAll(hset);
	 	System.out.println("using addall:" +hset1);
	 	
        Object std[] = hset1.toArray(); 
        Boolean retainAll = hset.retainAll(hset1);
        System.out.println(std + "    Retain the elements:" +retainAll);
        
        String Strobj = new String("kala ,lalu,35,i7,56");
        System.out.print("Output String Value :");
        System.out.println(Strobj.toString()); 
        
	}
}

