package DataBase;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static final String USERNAME = "oauth-muralimanohar.rv-85f8f";

	public static final String ACCESS_KEY = "fa9a083b-ce7a-4c31-b6fe-38a6f7a77eeb";

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();

		caps.setCapability("platform", "Windows 7");

		caps.setCapability("version", "51.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

	}

}