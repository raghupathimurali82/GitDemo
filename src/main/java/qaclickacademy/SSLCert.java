package qaclickacademy;

import java.io.File;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.URL;

import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;

import org.openqa.selenium.Capabilities;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.CapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

import org.openqa.selenium.TakesScreenshot;

public class SSLCert {

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",

				"D://TECHM//MV465619//Murali//Test//Softwares//chromedriver_win32//chromedriver.exe");

		WebDriver driver;

		DesiredCapabilities ch = new DesiredCapabilities();

		ch.acceptInsecureCerts();

		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);

		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		// Belows to your local browser ChromeOptions c= new ChromeOptions();
		
		ChromeOptions c= new ChromeOptions();

		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "");
		

		driver = new ChromeDriver(c);

		driver.manage().window().maximize();
		driver.manage().window().minimize();

		driver.manage().deleteAllCookies();

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new

		File("D://TECHM//MV465619//Murali//Test//Softwaresscreenshot.png"));

		driver.get("http://rahulshettyacademy.com/AutomationPractice/");

		// String url =
		// driver.findElement(By.cssSelector("a[href='brokenlink']")).getAttribute("href");

		SoftAssert a = new SoftAssert();

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		for (WebElement link : links) {

			String url1 = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url1).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respcode = conn.getResponseCode();

			System.out.println(respcode);

			a.assertTrue(respcode < 400, "The link with test" + link.getText() + "is broken");

		}

		a.assertAll();

	}

}
