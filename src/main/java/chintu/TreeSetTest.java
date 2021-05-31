package chintu;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import chintu.Student;

public class TreeSetTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		
		TreeSet <Student> tset = new TreeSet <Student>();
	 	tset.add(s2);
	 	tset.add(s1);
	 	tset.add(s4);
	 	tset.add(new Student("killa", "efg", 35, "i7", 91));
	 	Student std = tset.last();
	 	Iterator<Student> x = tset.descendingIterator();  
        while (x.hasNext()) {
        	System.out.println(x.next());
        	System.out.println();
        }
        System.out.println("last " +std);
        System.out.println();
        
        TreeSet <Integer> tset1 = new TreeSet <Integer>();
	 	tset1.add(20);
	 	tset1.add(10);
	 	tset1.add(5);
	 	tset1.add(30);
	 	Integer higher = tset1.higher(10);
	 	Integer ceiling = tset1.ceiling(3);//grater num for given value from tset1 values
	 	Integer floor = tset1.floor(23);//lesser num for given value from tset1 values
	 	System.out.println("Higher value for given num:" +higher);
	 	System.out.println("Ceiling value:" +ceiling +"   Using floor:"+floor);
	 	NavigableSet <Integer> a = tset1.descendingSet();  
        System.out.println("decending set:" +a);
        System.out.println();
        Integer polllast = tset1.pollLast();
        boolean isContain= tset1.contains(35);
        Comparator<? super Integer> comparator =  tset1.comparator();
        System.out.println("Polllast value:"+polllast   + "   Is contains:" +isContain );
        System.out.println("Using comparator:" +comparator); 
	}
}
