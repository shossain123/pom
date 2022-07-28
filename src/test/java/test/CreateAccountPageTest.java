package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

//https://accounts.google.com/signup

public class CreateAccountPageTest extends BaseTest{

	@Test(dataProvider="newaccount")
	public void createaccountpageTest(String firstname,String lastname,String email,String pass) {
		getHomePage();
		homepage.clickOnCreateAccountBtn();
		getCreateAccountPage();
		
		createaccountpage.typeFirstName(firstname);
		createaccountpage.typeLastName(lastname);
		createaccountpage.typeEmail(email);
		createaccountpage.typePassword(pass);
		
		
	}
	
	@DataProvider(name="newaccount")
	public Object[][] dataloader() throws IOException{
		
		Object[][] t;

		String filename = "data/FB.xlsx";
		String sheetname = "Sheet1";

		ExcelReader er = new ExcelReader(filename, sheetname);
		t = er.excelToArray();
		return t;
	}
}
