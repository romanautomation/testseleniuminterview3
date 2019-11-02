package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.org.omg.CORBA.InitializerSeqHelper;

import pages.BasePage;
import pages.LoginPage;
import pages.PatientListingPage;




public class LoginTest extends BasePage{
	
	
	
	
	
	static LoginPage lp;
	PatientListingPage plp;
    static WebDriver driver;
    
	
	
	@BeforeMethod
	@Parameters(value="browser")
	public static void setUp(String browserName){
		
		initialisation(browserName);
		lp = new LoginPage();
	}
	
	
	@Test
	public void doLoginTest(){
		
		plp = lp.doLogin("eva@a.com", "123456");
	}
	

}
