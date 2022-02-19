package qaclickacademy;

import java.util.Iterator;

import java.util.List;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class FlightBookingCompleteExample {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@value='radio2']")).click();

		System.out.println(driver.findElement(By.xpath("//input[@value='radio2']")).isEnabled());

		driver.findElement(By.id("autocomplete")).sendKeys("Ind");

		Thread.sleep(3000);

		List<WebElement> items = driver.findElements(
				By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li/div"));

		int count = items.size();

		System.out.println(count);

		for (int i = 0; i <= count; i++)

		{

			String text = items.get(i).getText();

			if (text.equalsIgnoreCase("India"))

			{

				items.get(i).click();

				break;

			}

		}

		// System.out.println(driver.findElement(by));

		/*
		 * for(WebElement item : items)
		 * 
		 * {
		 * 
		 * if(item.getText().equalsIgnoreCase("India"))
		 * 
		 * {
		 * 
		 * item.click();
		 * 
		 * break;
		 * 
		 * }
		 * 
		 * }
		 */

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));

		System.out.println(driver.findElement(By.id("dropdown-class-example")).getText());

		Thread.sleep(3000);

		Select se = new Select(dropDown);

		se.selectByIndex(1);

		System.out.println(driver.findElement(By.id("dropdown-class-example")).getText());

		driver.findElement(By.id("checkBoxOption1")).click();

		System.out.println(driver.findElement(By.id("checkBoxOption1")).isEnabled());

		/*
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * Set<String> windows = driver.getWindowHandles();
		 * 
		 * 
		 * 
		 * Iterator<String> it = windows.iterator();
		 * 
		 * 
		 * 
		 * String ParentId = it.next();
		 * 
		 * 
		 * 
		 * String ChildId = it.next();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.xpath("//button[id='openwindow']")).click();
		 * 
		 * 
		 * 
		 * Thread.sleep(3000);
		 * 
		 * 
		 * 
		 * driver.switchTo().window(ChildId);
		 * 
		 * 
		 * 
		 * System.out.println(driver.findElement(By.className("text-center")).getText().
		 * equalsIgnoreCase("Featured Courses"));
		 * 
		 * 
		 * 
		 * driver.switchTo().window(ParentId);
		 */

		driver.findElement(By.name("enter-name")).sendKeys("Murali");

		Thread.sleep(3000);

		driver.findElement(By.id("alertbtn")).click();

		driver.switchTo().alert().accept();

		List<WebElement> Prices = driver.findElements(By.xpath("//*[@name='courses']/tbody/tr/td[3]"));

		int count2 = Prices.size();

		System.out.println(count2);

		List<WebElement> Amounts = driver.findElements(By.xpath("//*[@id='product']/tbody/tr/td[4]"));

		int counts3 = Amounts.size();

		System.out.println(counts3);

		int var = 0;

		int k = 0;

		for (WebElement Amount : Amounts)

		{

			String str = Amount.getText();

			System.out.println(str);

			int j = Integer.parseInt(str);

			var = var + j;

		}

		System.out.println(var);

	}

}