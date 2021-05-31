package chintu;

import java.util.HashMap;

import chintu.Student;

public class HashMapTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		
		HashMap<Student, Integer> hmap = new HashMap <Student , Integer>();
		hmap.put(s1, 29);
		hmap.put(s2, 30);
		hmap.put(s3, 21);
		
		boolean iscontains = hmap.containsKey(s6);
		
		Integer integer = hmap.replace(s1, 20);
		
		boolean remove = hmap.remove(s5,30);
		
		boolean isempty = hmap.isEmpty();
		
		System.out.println("student details:" +hmap + "iscontains:" +iscontains);
		System.out.println();
		System.out.println("replace:" +integer + " remove s2:" + remove + " empty or not:" +isempty);
	}

}
