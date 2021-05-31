package chintu;

public class MultithreadingTest {

	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			Thread object = new Thread(new Multithreading());
			object.start();
			print();
		}
		System.out.println(Thread.currentThread().getName());
	}

	private static void print() {
		System.out.println("name");
	}
}
