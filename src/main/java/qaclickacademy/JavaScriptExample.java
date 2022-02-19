package qaclickacademy;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C://Murali_Selenium//softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeAsyncScript("window.scrollBy(0,500)");

		Thread.sleep(3000);

		js.executeScript("document.querySelector('.tableFixedHead').scrollTop=5000");

	}

}
