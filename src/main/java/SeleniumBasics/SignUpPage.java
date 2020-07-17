package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {

		String browser = "Chrome";
		String url = "https://www.orangehrm.com/orangehrm-30-day-trial/";
		WebDriverFactory wf = new WebDriverFactory();
	    WebDriver driver  =	wf.launchBrowser(browser);
		wf.launchUrl(url);

		System.out.println("The title of page is : " + wf.getPageTitle());
		
		By firstName = By.id("Form_submitForm_FirstName");
		By lastName = By.id("Form_submitForm_LastName");
		By email = By.id("Form_submitForm_Email");
		By jobTitle = By.id("Form_submitForm_JobTitle");
		By employees = By.id("Form_submitForm_NoOfEmployees");
		By company = By.id("Form_submitForm_CompanyName");
		By industry = By.id("Form_submitForm_Industry");
		By phone = By.id("Form_submitForm_Contact");
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		
		
		ElementUtil ut = new ElementUtil(driver);
		ut.doSendKeys(firstName, "Anjali");
		ut.doSendKeys(lastName, "Saini");
		ut.doSendKeys(email, "test@gmail.com");
		ut.doSendKeys(jobTitle, "software developer");
	    ut.doSelectByVisibleText(employees, "21 - 25");
		ut.doSendKeys(company, "IT Dpt");
        ut.doSelectByIndex(industry,5);
        ut.doSendKeys(phone, "91976582");
        ut.doSelectByVisibleText(country, "India");
        System.out.println(ut.getDropDownArrayList(country));
        try{
        ut.doSelectByVisibleText(state, "Punjab");}
        catch(Exception e){
        	
        }
       
        
        
        Thread.sleep(5000);
        wf.closeBrowser();
	}

}
