package bai6_4;

import static org.testng.Assert.assertEquals;

import org.jsoup.nodes.CDataNode;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bai4 {
	
	@BeforeTest
	public void BeforTest() {
		  WebDriverManager.chromedriver().setup();
			ChromeDriver cd = new ChromeDriver();
			cd.get("https://demo.guru99.com/v4/");
			
		cd.findElementByName("UserID").sendKeys("mngr394913");
		cd.findElementByName("Password").sendKeys("revegAz");
		cd.findElementByName("LOGIN").click();
	}
	
	@Test
	public void ktraDung() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		
		assertEquals(cd.getCurrentUrl(),"https://demo.guru99.com/v4/manager/Managerhomepage.php");
		System.out.println("Ddanwg nhaaj ddusng trang");
	}
}