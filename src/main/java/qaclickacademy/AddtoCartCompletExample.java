package qaclickacademy;

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedCondition;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCartCompletExample {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebDriverWait wait1 = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] vegs = { "Cucumber", "Brocolli", "Beetroot" };

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		int count = products.size();

		System.out.println(count);

		List itemsNeededList = Arrays.asList(vegs);

		for (int i = 0; i < count; i++)

		{

			String afterSplit = products.get(i).getText().split("-")[0].trim();
			
			

			System.out.println(afterSplit);

			if (itemsNeededList.contains(afterSplit))

			{

				driver.findElement(By.className("increment")).click();

				driver.findElement(By.className("increment")).click();

				// driver.findElement(By.xpath("//*[@class='stepper-input']/a[2]")).click();

				driver.findElements(By.xpath("//div[@class='stepper-input']/a[2]")).get(i).click();

				driver.findElements(By.xpath("//div[@class='stepper-input']/a[2]")).get(i).click();

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}

		}

		// Thread.sleep(3000);

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		driver.findElement(By.cssSelector("[class='action-block'] button")).click();

		// Thread.sleep(3000);

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));

		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");

		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

		wait1.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='root']/div/div/div/div/div/select")));

		// driver.findElement(By.xpath("//*[@classs='products-wrapper']/div/div/div/select")).click();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id='root']/div/div/div/div/div/select"));

		Select se = new Select(dropdown);

		se.selectByVisibleText("India");

		driver.findElement(By.className("chkAgree")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();

	}

}