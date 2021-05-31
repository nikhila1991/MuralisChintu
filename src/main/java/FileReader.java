import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileReader {

	public static void main(String[] args) throws Exception {
		 FileInputStream in = null;
	     FileOutputStream out = null;

	     try {
	    	 in = new FileInputStream("D:\\nikiProjects\\chintu\\src\\main\\resources\\Sample.txt");
	         out =new FileOutputStream("D:\\nikiProjects\\chintu\\src\\main\\resources\\Output.txt");
	         
	         int c;
	         while ((c = in.read()) != -1) {
	            out.write(c);
	         }
	      }finally {
	         if (in != null) {
	            in.close();
	         }
	         if (out != null) {
	            out.close();
	         }
	      }
	      System.out.println("file reader");
		}

	public int read() {
		return 0;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
