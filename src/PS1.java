import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS1 extends PS {

	@BeforeMethod
	public void beforeRun() {
		System.out.println("I am in (Before Method) Child class.");
		System.out.println("I am in GitDemo - develop branch");
	}

	@Test
	public void testRun() {
		PS2 ps2 = new PS2(3);

		int a = 3;
		doThis();
		System.out.println("Result from PS2: " + ps2.increment());
		System.out.println("Result from PS2: " + ps2.decrement());

		System.out.println("Result from PS3: " + ps2.mulitplyThree());
		System.out.println("Result from PS3: " + ps2.mulitplyTwo());
	}

	@Test
	public void deleteTwitter() {
		System.out.println("delete Twitter - develop branch");
	}
}
