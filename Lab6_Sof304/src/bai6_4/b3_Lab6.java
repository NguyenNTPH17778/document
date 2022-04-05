package bai6_4;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class b3_Lab6 {

		@Parameters({"BrowserName"})
		@Test
		public void openBrowser (String BrowserName) {
			System.out.println("Browser : " + BrowserName);
		}
		@Parameters({"UserName","Passcode"})
		@Test
		public void fillformLogin (String UserName,String passcode) {
			System.out.println("Browser name: " +  UserName);
			System.out.println("Browser passcode: " +  passcode);
		}
}

