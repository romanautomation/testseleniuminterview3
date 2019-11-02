package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.PatientAddPage;
import util.Utility;






public class PatientAddTest extends BasePage {

	
	PatientAddPage pap;
	Utility ut;
	
	
	@BeforeMethod
	public void setUp(){
		pap = new PatientAddPage();
		ut = new Utility();
	}
	

	
	@Test(priority=1)
	public void blankFormTest(){
		
		ut.toShow(driver.findElement(By.xpath("//button[@ng-click='addPatient()']")), driver, 60).click();
		
		ut.scrollPageDown(driver);
		
//		ut.scrollIntoView(driver.findElement(By.xpath("//button[@type='submit']")), driver);
		
		ut.toShow(driver.findElement(By.xpath("//button[@type='submit']")), driver, 60).click();
		
//		pap.patientAdd();
	}
	
	@Test(priority=2)
	public void patientAddTo(){
		
//		ut.toShow(driver.findElement(By.xpath("//button[@ng-click='addPatient()']")), driver, 60).click();
		
		pap.patientAdd("ron","suleman","11/22/1988");
	}
}
