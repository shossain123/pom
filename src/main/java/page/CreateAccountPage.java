package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreateAccountModel;

public class CreateAccountPage extends CreateAccountModel {

	public CreateAccountPage(WebDriver d) {
		super(d);
	}

	public void typeFirstName(String firstname) {
		WebElement e = getFirstName();
		e.sendKeys(firstname);
		
	}
	public void typeLastName(String lastname) {
		WebElement e1 = getLastName();
		e1.sendKeys(lastname);
		
	}
	public void typeEmail(String email) {
		WebElement e2 = getEmail();
		e2.sendKeys(email);
		
	}
	public void typePassword(String pass) {
		WebElement e3 = getPassword();
		e3.sendKeys(pass);
		
	}
	
}
