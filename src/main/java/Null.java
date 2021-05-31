import java.io.FileWriter;
import java.io.IOException;

public class Null {

	public static void main(String[] args) throws IOException {
		 FileReader in = null;
	     FileWriter out = null;

	      try {
	         in = new FileReader();
	         out = new FileWriter("D:\\nikiProjects\\chintu\\src\\main\\resources\\nulloutput.txt");
	         
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

	}

}
