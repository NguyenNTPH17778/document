package bai1;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fpoly {
	  @Test
	  public void f() {
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver cd = new ChromeDriver();
		  cd.get("https://lms.poly.edu.vn/");  
		  assertEquals(cd.getTitle(), "Learning Management System | Hệ thống quản trị học tập | FPT Polytechnic Việt Nam");
		  cd.close();		  
	  }
	
	

}
