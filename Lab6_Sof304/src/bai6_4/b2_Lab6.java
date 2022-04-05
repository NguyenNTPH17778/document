package bai6_4;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class b2_Lab6 {


  @BeforeTest
  public void beforTest() {
	  System.out.println("testClass: befor test");
  }
  
  @Test
  public void unitLevel1() {
	  System.out.println("testClass: unit level1 testing");
  }
  
  @Test
  public void unitLevel2() {
	  System.out.println("testClass: unit level2 testing");
  }
  
  @BeforeMethod
  public void beforMethod() {
	  System.out.println("testClass: befor method");
  }
  
  @BeforeMethod
  public void staticBeforeMethod() {
	  System.out.println("testClass: static befor method");
  }
  
  @Parameters({"param"})
  @BeforeMethod
  public  void beforeMethodParameters() {
	  System.out.println("staticBeforeMethod para");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("testClass: after method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("testClass: before class");
  }
  
  @AfterClass
  public void afterclass() {
	  System.out.println("testClass: after class");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("testClass: after test");
  }

}
