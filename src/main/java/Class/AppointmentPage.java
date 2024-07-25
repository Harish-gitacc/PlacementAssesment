package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic.BasicFile;

public class AppointmentPage  extends BasicFile{
	@FindBy(className = "form-control")
	WebElement DropDounBTN;
	@FindBy(xpath ="//input[@id='chk_hospotal_readmission']")
	WebElement Clickbox;
	@FindBy(className =  "input-group-addon")
	WebElement Calander;
	@FindBy(xpath = "(//td[@class='day'][normalize-space()='22'])[1]")
	WebElement date;
	@FindBy(id = "txt_comment")
	WebElement Commentbox;
	@FindBy(id = "btn-book-appointment")
	WebElement Book;
	@FindBy(linkText = "Appointment Confirmation")
	WebElement ver;
	@FindBy(linkText  = "Go to Homepage")
	WebElement gotohome;
	@FindBy(id  = "menu-toggle")
	WebElement menu;
	@FindBy(linkText  = "Logout")
	WebElement logout;

	public AppointmentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void Bookap() throws InterruptedException {
		Thread.sleep(2000);
		clickOn(Clickbox);
		clickOn(Calander);
		clickOn(date);
		clickAndenter(Commentbox, "Ensure me once the appointement is fixed");
		clickOn(Book);
		Thread.sleep(2000);
		
	}
	public void goback() {
		clickOn(gotohome);
		
	}
	public void logt() {
		clickOn(menu);
		clickOn(logout);
	}

}
