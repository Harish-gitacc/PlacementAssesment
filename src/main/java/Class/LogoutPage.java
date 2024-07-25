package Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basic.BasicFile;

public class LogoutPage extends BasicFile {
	@FindBy(id  = "menu-toggle")
	WebElement menu;
	@FindBy(linkText  = "Logout")
	WebElement logout;


    public LogoutPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
     }
    public void logout() {
		clickOn(menu);
		clickOn(logout);
	}
}