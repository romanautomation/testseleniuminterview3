package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PatientAddPage extends BasePage {

	
	
	
    public void patientAdd(String firstName, String lastName, String DOB){
		driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).click();
		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys(DOB);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
      
//    public void patientAdd(){
//    	
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}

}
