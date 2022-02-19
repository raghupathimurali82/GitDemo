package qaclickacademy;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.Assert;

//import com.sun.tools.javac.util.Assert;

public class SelectCode {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Code for Static DropDown which is Currency in the Site

		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticDropdown);

		dropdown.selectByIndex(2);

		dropdown.selectByIndex(3);

		dropdown.selectByValue("INR");

		dropdown.selectByVisibleText("INR");

		System.out.println(dropdown.getFirstSelectedOption().getText());

		// Code for Multi Static Dropdown which is Slecting Passengers in the Site

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		/*
		 * int i=1;
		 * 
		 * 
		 * 
		 * while(i<5)
		 * 
		 * 
		 * 
		 * {
		 * 
		 * 
		 * 
		 * driver.findElement(By.id("hrefIncAdt")).click();//4 times
		 * 
		 * 
		 * 
		 * i++;
		 * 
		 * 
		 * 
		 * }
		 */

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

			driver.findElement(By.id("hrefIncChd")).click();

			driver.findElement(By.id("hrefIncInf")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5

		// Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		// Code for Auto Selective DropDown which is Currency in the Site

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options)

		{

			if (option.getText().equalsIgnoreCase("India"))

			{

				option.click();

				break;

			}

		}

		// Code for Check Box Selection and De-Selection

		// driver.get("http://spicejet.com"); //URL in the browser

		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// Assert.assertFalse(true);System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).getText());

		// System.out.println(driver.findElements(By.cssSelector("input[type=checkbox")).size());

		// Code for Radio Button & Calendar

		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

			System.out.println("its enabled");

			Assert.assertTrue(true);

		}

		else

		{

			Assert.assertTrue(false);

		}

	}

}
