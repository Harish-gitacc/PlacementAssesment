package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import Basic.BasicFile;
import Class.LoginPage;

public class TC_01_LoginTest extends BasicFile{
	public void setup() {
		testName = "Login Application";
	}
	@Test(dataProvider ="getFromExcel" )
	public void TC_01_Login(String username,String pswd) throws InterruptedException {
		LoginPage log=new LoginPage(driver);
		log.login(username, pswd);
		Assert.assertTrue(driver.getCurrentUrl().contains("#appointment"));
		try {
			log.screenShot(testName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
