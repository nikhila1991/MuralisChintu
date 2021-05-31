package com.bp.abc.test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

import com.bp.abc.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Employee niki = new Employee("niki", "karuna");
		Employee kiki = new Employee("kiki", "karuna");
		Employee nikila = new Employee("nikila", "sub");
	
		Vector<Employee> ve = new Vector<Employee>();
		ve.add(nikila);
		ve.add(kiki);
		ve.add(niki);
//		ve.add(kiki);
//		System.out.println("size:" +ve.size());
//		ve.add(2, nikila);
//		System.out.println("size:" +ve.size());
//	
//		 Enumeration<Employee> en = ve.elements();
//		 while (en.hasMoreElements())
//		 {
//			Employee employee = (Employee) en.nextElement();
//			System.out.println("name:" +employee);
//		 }
		 		
		 for (Employee employee : ve) {
			System.out.println("emp fName:" +employee.getfName() + " emp lName:" +employee.getlName());	
		 }
//		
//		Stack<String> stk = new Stack<String>();
//		stk.push("pari");
//		stk.push(new String("chintu"));
//		stk.push("vani");
//		System.out.println("size:"+stk.size());
//		/* stk.pop(); */
//		System.out.println("size:"+stk.size());
//		
		/*
		 * Enumeration<String> enu = stk.elements(); while (enu.hasMoreElements()) {
		 * String string = (String) enu.nextElement(); System.out.println("name:"
		 * +string); }
		 */		
		Hashtable<Integer,Vector<String>> hash = new Hashtable<Integer, Vector<String>>();
		Vector<String> vc = new Vector<String>();
		vc.add("chaithu");
		vc.add("bashi");
		vc.add("amrutha");
		vc.add("amma");
		hash.put(5,vc);
		
		Enumeration <Vector<String>> x = hash.elements(); 
		while (x.hasMoreElements()) {
			Vector<java.lang.String> vector = (Vector<java.lang.String>) x.nextElement();
		for (String string : vector) {
			System.out.println("name:" +string);
			}	
		}
//	
//		Properties properties = new Properties();
//		properties.put("abc", "red");
//		System.out.println(properties.get("abc"));
//		
//		
//		
		
//		 System.out.println("fname:"+niki.getfName() + " lname:" +niki.getlName());
//		 System.out.println("fname:"+kiki.getfName() + " lname:" +kiki.getlName());
//		 System.out.println("fname:"+nikila.getfName() + " lname:" +nikila.getlName());
//		 
	}

}
