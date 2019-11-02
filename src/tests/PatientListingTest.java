package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.PatientAddPage;
import pages.PatientListingPage;



public class PatientListingTest extends BasePage {

	PatientListingPage plp;
	PatientAddPage pap;
	WebDriver driver;

	
	
	@Test
	public void patientListingTest(){
		plp = new PatientListingPage();
		pap = plp.patientSearch();
		
	}
}
