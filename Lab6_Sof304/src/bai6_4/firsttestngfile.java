package bai6_4;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;

public class firsttestngfile {
	public String Urllms ="https://lms.poly.edu.vn";
	public String Urlcms ="https://cms.poly.edu.vn";
	public String urlapoly ="https://ap.poly.edu.vn/";
	public WebDriver driver;
	
	@Test
	public void verifyHomepageTitleLms() {
		driver.get(Urllms);
		String expectedTitle="Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam";
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifyHomepageTitleCms() {
		driver.get(Urlcms);
		String expectedTitle="| FPT Polytechnic | Course Management System";
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void verifyHomepageTitleAp() {
		driver.get(urlapoly);
		String expectedTitle="Cao đẳng FPT Polytechnic";
		String actualTitle=driver.getTitle();
		AssertJUnit.assertEquals(actualTitle, expectedTitle);
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("launching chrome browser");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}

}
