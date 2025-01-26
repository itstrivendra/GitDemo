import org.testng.annotations.AfterMethod;

public class PS {

	public void doThis() {
		System.out.println("I am here in Parent Class");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am here in (After Method) Parent Class.");
	}

}
