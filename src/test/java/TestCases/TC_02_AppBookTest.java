package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basic.BasicFile;
import Class.AppointmentPage;
import Class.LoginPage;

public class TC_02_AppBookTest extends BasicFile{
	public void setup() {
		testName = "Booking appointment";
	}
	
	@Test()
	public void TC_02_AppBook() throws InterruptedException {
		
		
		LoginPage log=new LoginPage(driver);
		log.login("John Doe", "ThisIsNotAPassword");
		AppointmentPage appointment =new AppointmentPage(driver);
		appointment.Bookap();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://katalon-demo-cura.herokuapp.com/appointment.php#summary"));
		try {
			appointment.screenShot(testName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		appointment.goback();
		appointment.logt();
		Assert.assertTrue(driver.getCurrentUrl().contains("katalon-demo"));
		try {
			appointment.screenShot(testName);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
