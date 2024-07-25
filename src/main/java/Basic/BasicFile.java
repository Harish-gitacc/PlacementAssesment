package Basic;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Utiles.UtilesFile;

public class BasicFile extends UtilesFile{
	@BeforeMethod
	public void start() throws Exception {
		launchbrowser(readproperty("browser"));
		getapplication(readproperty("url"));
	}

	@AfterMethod
	public void close() {
		driver.close();
	}
	@DataProvider
	public Object[][] getFromExcel() throws Exception {
		Object[][] data = dataReader();
		return data;
	}
	
}
