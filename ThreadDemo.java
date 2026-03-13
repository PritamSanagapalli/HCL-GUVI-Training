public class ThreadDemo extends Thread {
	private String message;

	public ThreadDemo(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		System.out.println(message + " from thread: " + Thread.currentThread().getName());
		System.out.println("This is the overridden run method.");
	}

	public static void main(String[] args) {
		ThreadDemo t1 = new ThreadDemo("Hello");
		t1.start();
		System.out.println("I created this Thread: " + t1.getName());
	}
}
