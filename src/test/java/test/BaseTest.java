package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import page.CreateAccountPage;
import page.HomePage;

public class BaseTest {
WebDriver driver;
static HomePage homepage;
static CreateAccountPage createaccountpage;
@BeforeSuite
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
}

public HomePage getHomePage() {
	homepage = new HomePage(driver);
	return homepage;
}
public CreateAccountPage getCreateAccountPage() {
	createaccountpage = new CreateAccountPage(driver);
	return createaccountpage;
}




}
