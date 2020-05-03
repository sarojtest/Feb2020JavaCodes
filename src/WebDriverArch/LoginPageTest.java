package WebDriverArch;

public class LoginPageTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "firefox";

		// ChromeDriver driver = new ChromeDriver();
		// FirefoxDriver driver = new FirefoxDriver();

		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("http://www.google.com");
		driver.findElement("username");
		driver.findElement("password");
		driver.findElement("login");

		System.out.println(driver.getTitle());

	}

}
