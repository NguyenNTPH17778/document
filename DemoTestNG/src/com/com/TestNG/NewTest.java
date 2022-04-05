package com.com.TestNG;

import org.testng.annotations.Test;

import com.TestNG.Maths;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	Maths mt;
	
  @Test
  public void f() {
	  int sum = 10; 
	  
	  assertEquals(mt.Plus(5, 5), sum);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  mt = new Maths();
	  
  }

  @AfterTest
  public void afterTest() {
	  mt = null;
  }
  
  @Test
  public void f1() {
	  int sum = 10; 
	  
	  assertNotEquals(mt.Plus(4, 5), sum);
	
	  
  }
  
  @Test
  public void f2() {
	  WebDriverManager.chromedriver().setup();
	ChromeDriver cd = new ChromeDriver();
	cd.get("https://www.facebook.com");
	
	//--Cách 1
//	cd.findElementByName("email").sendKeys("Hello");
//	cd.findElementByName("pass").sendKeys("Hello");
//	cd.findElementByName("login").click();
	 
	//--Cách 2
	WebElement we = cd.findElementByName("email");
	we.sendKeys("kkkk");	
	cd.close();
	
  }
  
  @Test
  public void chuvi() {
	  int cv = 20;
	  
	  assertEquals(mt.TinhCViHCN(5, 5), cv);
  }
  
  @Test
  public void chuviNO() {
	  int cv = 20;
	  
	  assertNotEquals(mt.TinhCViHCN(4, 5), cv);
  }
  
}
