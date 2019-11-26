package smokeTests;

import static org.junit.Assert.*;

import java.sql.Driver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import startClass.StartClass;
import utils.ChromeTestingBrowser;

public class LoginPage extends StartClass {
	public WebDriver driver;
	
	@Before
	protected void setUp() throws InterruptedException {
		driver = new ChromeTestingBrowser().startHMSInChrome();
		
		
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
		System.out.println("First Test");
	}

}
