package com.Thue.com.Thue;

import org.testng.annotations.Test;
import com.Thue.*;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ThueTest {
	
	Thue thue;
  @BeforeTest
  public void beforeTest() {
	  thue = new Thue();
  }

  @AfterTest
  public void afterTest() {
	  thue = null;
  }


  @Test
  public void ThueMyTest5() {
    double ab = 4.0;
    
    assertEquals(thue.ThueMy(4.0),ab);
	  
  }
  
  @Test
  public void ThueMyTest10() {
    double ab = 9.7;
   assertNotEquals(thue.ThueMy(9.7),ab);
	  
  }
  
  @Test
  public void ThueMyTest15() {
	  double x = 17.0;
   assertNotEquals(thue.ThueMy(17.0),x);
	  
  }
  
  @Test
  public void ThueMyTest20() {
    double ab = 30.0;
   assertNotEquals(thue.ThueMy(30.0),ab);
	  
  }
  
  @Test
  public void ThueMyTest25() {
    double ab = 34.0;
   assertNotEquals(thue.ThueMy(34.0),ab);
	  
  }
  
  @Test
  public void ThueMyTest30() {
    double ab = 60.0;
   assertNotEquals(thue.ThueMy(60.0),ab);
	  
  }
  
  @Test
  public void ThueMyTest35() {
    double ab = 90.0;
   assertNotEquals(thue.ThueMy(90.0),ab);
	  
  }
  


}

