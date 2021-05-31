package chintu;

import java.util.*;

public class TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap <Integer,String> tmap=new TreeMap <Integer,String>();
		tmap.put(10,"I");
		tmap.put(11,"Love");
		tmap.put(12,"My");
		tmap.put(13,"Self"); 
		System.out.println("Ceiling entry for 10: "+ tmap.ceilingEntry(10));
		System.out.println("Ceiling entry for 15: "+ tmap.ceilingEntry(15));
		
		String str = tmap.putIfAbsent(14, "niki");
		System.out.println("put if absent:" +str);
		
		NavigableSet <Integer> a = tmap.descendingKeySet(); 
        System.out.println();
        Integer ceilingKey = tmap.ceilingKey(8);
        
        NavigableMap<Integer,String> decending = tmap.descendingMap();
   
        System.out.println("decending key:"+a +"   Using ceiling key:"+ceilingKey);
        System.out.println("Decending map:"+decending );
	}

}
