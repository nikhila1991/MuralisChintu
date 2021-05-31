package chintu;

public class OuterClass {
	private static int x = 10; 
    private static int y = 20;

    	public static class InnerClass {
    		int z=30; 
    		void value() {
    		System.out.println("x value:"+ x +" y value:" +y +" z value:" +z);
			}
    	}
}


