package chintu;

import java.util.Iterator;
import java.util.LinkedList;

import chintu.Student;

public class LinkedListTest {

	public static void main(String[] args) {
		Student s1 = new Student("niki","karuna", 29, "i1", 85);
		Student s2 = new Student("kiki","reddy", 30, "i2", 75);
		Student s3 = new Student("nila","pillai", 21, "i3", 95);
		Student s4 = new Student("kiki","nayudu", 22, "i4", 85);
		Student s5 = new Student("niha","yadhava", 25, "i5", 65);
		Student s6 = new Student("niha","yadhava", 25, "i5", 65);
		
		LinkedList<Student> llist = new LinkedList<Student>();
	 	llist.addFirst(s6);
	 	llist.addLast(s1);
	 	llist.add(s4);
	 	llist.add(s3);
	 	llist.add(s2);
	 	
	 	Iterator<Student> x = llist.descendingIterator();  
        while (x.hasNext()) {
        	System.out.println(x.next());
        	System.out.println();
        }
       
        System.out.println("The initial Linked List is : " + llist); 
        System.out.println("Head element of the list is : " + llist.pollFirst());
        System.out.println("Linked List after removal using pollFirst() : " + llist); 
        }
	}

