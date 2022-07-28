package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountModel extends BaseModel{

	public CreateAccountModel(WebDriver d) {
		super(d);		
		
	}
	
	public WebElement getFirstName() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
		return e;
	}
	public WebElement getLastName() {
		
		WebElement e1 = driver.findElement(By.xpath("//input[@name='lastname']"));
		return e1;
	}
public WebElement getEmail() {
		
		WebElement e2 = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return e2;
	}
public WebElement getPassword() {
	
	WebElement e3 = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
	return e3;
}

	

}
