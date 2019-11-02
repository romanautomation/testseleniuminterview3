package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage extends Page{

	public static WebDriver driver;
	
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	
	public static void initialisation(String browserName){
		
            if(browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "E:\\E swapnil\\software\\Selenium\\chrome driver\\chromedriver.exe");
			 driver = new ChromeDriver();
			
         } else if(browserName.equals("ff")){
    			System.setProperty("webdriver.gecko.driver", "E:\\E swapnil\\software\\Selenium\\gecko\\geckodriver.exe");
    			 driver = new FirefoxDriver();
    	 } else{
			System.out.println("No browser is defined");
		}
		
		
		driver.get("http://138.197.213.237/auth-mvp-dev1/public/login?redirect_to=imagndev.com/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

}
