package DataBase;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dataBaseConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

// TODO Auto-generated method stub

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/manohar", "root", "Puvi@2014");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from market");

		while (rs.next())

		{

			System.setProperty("webdriver.chrome.driver", "C://Murali_Selenium//softwares//chromedriver_win32//chromedriver.exe");
			WebDriver driver= new ChromeDriver();

			driver.get("https://login.salesforce.com");

			driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));

			driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));

		}

	}

}
