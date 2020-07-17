package SeleniumBasics;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAssignment {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/14222/scorecard/299004"
				+ "/pakistan-vs-south-africa-1st-test-south-africa-tour-of-pakistan-2007-08");
		System.out.println(getBowlerName("AB de Villiers"));
		System.out.println(getScoreCard("MV Boucher"));
		driver.close();
	}

	public static String getBowlerName(String name) {
		return driver.findElement(By.xpath("(//a[text()='" + name + "']/..//following-sibling::td//span)[1]"))
				.getText();
	}

	public static List<String> getScoreCard(String name) {
		List<String> scoreList = new ArrayList<String>();
		List<WebElement> scores = driver.findElements(
			By.xpath("(//a[text()='" + name + "']/..)[1]" + "//following-sibling::td//following-sibling::td"));
		for (WebElement i : scores) {
			String text = i.getText();
			if (!text.isEmpty()) {
				scoreList.add(i.getText());
			}
		}
		return scoreList;

	}

}
