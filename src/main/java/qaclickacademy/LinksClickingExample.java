package qaclickacademy;

import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.WindowType;

import org.openqa.selenium.chrome.ChromeDriver;

public class LinksClickingExample {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("http://qaclickacademy.com/practice.php");

		WebElement footerHead = driver.findElement(By.id("gf-BIG"));

		WebElement firstColumn = footerHead.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		// firstColumn.GETS

		// List<WebElement> firstLinks = firstColumnHeader.findElements(By.)

		int countFirstColumn = firstColumn.findElements(By.tagName("a")).size();

		System.out.println(countFirstColumn);

		for (int i = 1; i <= countFirstColumn; i++)

		{

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			firstColumn.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			Thread.sleep(3000);

		}

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();

		Thread.sleep(3000);

		while (it.hasNext())

		{

			driver.switchTo().window(it.next());

			System.out.println(driver.getTitle());

		}

	}

}
