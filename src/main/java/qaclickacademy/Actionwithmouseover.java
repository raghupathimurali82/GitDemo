
package qaclickacademy;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Actionwithmouseover {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		Actions a = new Actions(driver);

		WebElement move = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
	

		// a.moveToElement(move).build().perform();

	}

}
