package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PatientListingPage extends BasePage {

	
	
	
   	public PatientAddPage patientSearch(){
			
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("aa");
					
			return new PatientAddPage();
			
		}
}
