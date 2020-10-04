
public class HelloWorldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld h = new HelloWorld();
		String greeting = h.greet();
		if (greeting.equalsIgnoreCase("Hello World")) {
			System.out.println("Test Successful");
		} else {
			System.out.println("Test fail");
		}

	}

}
