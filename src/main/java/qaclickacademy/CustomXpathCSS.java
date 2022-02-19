package qaclickacademy;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

import org.openqa.selenium.interactions.SendKeysAction;

import net.bytebuddy.ByteBuddy;

public class CustomXpathCSS {

	public static void main(String[] args) {

		// Create Driver Object for Chrome Browser

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com");

		/*
		 * //For custom Xpath -- //Tagname[*Attribute='value']---Syntax
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hi");
		 * 
		 * 
		 * 
		 * //For custom CSS -- Tagname[Attribute='value'] ---Syntax
		 * 
		 * 
		 * 
		 * driver.findElement(By.cssSelector("input[type='password']")).
		 * sendKeys("how are you");
		 * 
		 * //driver.close();
		 * 
		 * 
		 * 
		 * System.out.println(driver.getTitle());
		 */

		// XPATH CODE FOR SALES FORCE LOGIN PAGE - Syntax //tagName[@attribute='value']

		/*
		 * driver.get("https://login.salesforce.com");
		 * 
		 * driver.findElement(By.xpath("//*[@id='username']")).
		 * sendKeys("This is my User Name");
		 * 
		 * driver.findElement(By.xpath("//*[@id='password']")).sendKeys("this is my pwd"
		 * );
		 * 
		 * driver.findElement(By.xpath("//*[@id='Login']")).click();
		 * 
		 * driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
		 */

		// CSSSELECTOR CODE FOR SALES FORCE LOGIN PAGE - Syntax
		// tagName[Attribute='Value']

		// Other Syntaxes -- tagName#id, tagName.Css ----

		// Other Syntaxes -- Removed tagName from above --- #id,.css

		// We can remove the tagName for Cssselector Syntax for above one's

		/*
		 * driver.get("https://login.salesforce.com");
		 * 
		 * driver.findElement(By.cssSelector("#username")).
		 * sendKeys("This is my User Name");
		 * 
		 * driver.findElement(By.cssSelector("#password")).sendKeys("this is my pwd");
		 * 
		 * //driver.findElement(By.cssSelector("#Login")).click();
		 * 
		 * driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();//By
		 * Class Name -- Remove space by adding .
		 * 
		 * //driver.findElement(By.cssSelector("#forgot_password_link")).click();
		 * 
		 * System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		 */

	}

}