package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		By allChoices = By.cssSelector("span.comboTreeItemTitle");
		// selectChoice(allChoices,"choice 2 3");
		//selectMultipleChoices(allChoices, "choice 2", "choice 2 3", "choice 6", "choice 6 2 2");
		selectAllValues(allChoices, "all");
		
		Thread.sleep(4000);
		driver.close();
	}

	/**
	 * Method to select a single option from a list of dropdown option
	 * 
	 * @param locator
	 * @param value
	 */
	public static void selectChoice(By locator, String value) {
		List<WebElement> choiceList = driver.findElements(locator);
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			if (text.equals(value)) {
				choiceList.get(i).click();
				break;
			}
		}
	}

	public static void selectMultipleChoices(By locator, String... value) {
		List<WebElement> choiceList = driver.findElements(locator);
		for (int i = 0; i < choiceList.size(); i++) {
			String text = choiceList.get(i).getText();
			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					choiceList.get(i).click();
					break;
				}

			}
		}

	}

	public static void selectAllValues(By locator, String... value) {
	

			List<WebElement> choiceList = driver.findElements(locator);
			if (!value[0].equalsIgnoreCase("all")) {
			for (int i = 0; i < choiceList.size(); i++) {
				String text = choiceList.get(i).getText();
				for (int j = 0; j < value.length; j++) {
					if (text.equals(value[j])) {
						choiceList.get(i).click();
						break;
					}
				}

			}

		}
		
		else{
			try{
			for(int k =0;k<choiceList.size();k++){
				choiceList.get(k).click();
			}}
			catch(Exception e){
				
			}
		}
		
	}

}
