package qaclickacademy;

import org.openqa.selenium.By;

import org.openqa.selenium.By.ById;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Framebasicexample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));

		driver.findElement(By.id("draggable")).click();

		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.cssSelector("div[id='draggable']"));

		WebElement target = driver.findElement(By.cssSelector("div[id='droppable']"));

		a.dragAndDrop(source, target).build().perform();

	}

}
