package qaclickacademy;

import java.util.Iterator;

import java.util.List;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class FlightBooking {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		System.out.println(driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isEnabled());

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))

				.click(); // Parent Child relationship

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		/*
		 * driver.findElement(By.id("divpaxinfo")).click();
		 * 
		 * 
		 * 
		 * Thread.sleep(2000L);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();
		 * 
		 * driver.findElement(By.id("hrefIncChd")).click();
		 * 
		 * driver.findElement(By.id("hrefIncInf")).click();
		 */

		/*
		 * System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 * 
		 * 
		 * 
		 * WebElement dropdown =
		 * driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 * 
		 * 
		 * 
		 * System.out.println(driver.findElement(By.id(
		 * "ctl00_mainContent_DropDownListCurrency")).getText());
		 * 
		 * 
		 * 
		 * Select StaticDropDown = new Select(dropdown);
		 * 
		 * 
		 * 
		 * StaticDropDown.selectByIndex(0);
		 * 
		 * 
		 * 
		 * System.out.println(StaticDropDown.getFirstSelectedOption());
		 * 
		 * 
		 * 
		 * StaticDropDown.selectByValue("INR");
		 * 
		 * 
		 * 
		 * System.out.println(StaticDropDown.getFirstSelectedOption());
		 * 
		 * 
		 * 
		 * driver.findElement(By.name("ctl00$mainContent$chk_SeniorCitizenDiscount")).
		 * click();
		 * 
		 * System.out.println(driver.findElement(By.name(
		 * "ctl00$mainContent$chk_SeniorCitizenDiscount")).isEnabled());
		 */

		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getText());

		driver.findElement(By.className("ui-datepicker-trigger")).click();

		List<WebElement> dataValues = driver.findElements(By.className("ui-datepicker-title"));

		for (WebElement dataValue : dataValues)

		{

			if ((dataValue.getText()).contains("Sept"))

			{

				List<WebElement> days = driver.findElements(By.className("ui-state-default"));

				System.out.println(driver.findElements(By.className("ui-state-default")).size());

				int count = driver.findElements(By.className("ui-state-default")).size();

				for (int i = 0; i < count; i++) {

					String text = days.get(i).getText();

					if (text.equalsIgnoreCase("24"))

						days.get(i).click();

					break;

				}

			}

		}

	}

}