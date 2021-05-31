package chintu;

public class StringTest {

	public static void main(String[] args) {
		String fName = new String("abc");
		char[] chArr = {'c','h','a','i'};
		String val = new String(chArr);
		String name = "niki";
		String concat = name.concat(val);
		int len = concat.length();
		boolean isContains = concat.contains(fName);
		String subStr = concat.substring(4);
		String subStr1 = concat.substring(0,4);
		boolean isEqual = subStr1.equals(name);
		boolean isStarts = "nikhila karuna".startsWith("ka");
		System.out.println("fname:" +fName  + " charr:" +val + " name:" +name  + " concate:" +concat );
		System.out.println("is contains:"+isContains + " length:" +len + " sub string:" +subStr);
		System.out.println("sub string1:" +subStr1 + " isStartswith:" + isStarts + " isEqual:"+isEqual);
		name.concat(val);
	}

}
