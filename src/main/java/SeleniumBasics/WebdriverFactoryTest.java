package SeleniumBasics;

public class WebdriverFactoryTest {

	public static void main(String[] args) {
		
		String browser = "firefox";
		String url = "https://fb.com";
		WebDriverFactory wb = new WebDriverFactory();
		
		wb.launchBrowser(browser);
		wb.launchUrl(url);
	    String title = 	wb.getPageTitle();
		System.out.println(title);
		if (title.equalsIgnoreCase("facebook sign up")){
			System.out.println("title is correct");
		}
		else{
			System.out.println("title is incorrect");
		}
		
		
	System.out.println(wb.getCurrentUrl());
		
		wb.closeBrowser();
		
		
		
		
		
	}
	
	
	
	

}
