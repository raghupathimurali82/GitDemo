package qaclickacademy;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotVUheight {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",

				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String ParentId = it.next();

		String ChildId = it.next();

		driver.switchTo().window(ChildId);

	}

}