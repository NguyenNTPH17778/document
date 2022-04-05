package Model;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;



public class TestRunner {
	

	public static void main(String[] args) {	
		JUnitCore runner = new JUnitCore();
		Result result = runner.run(TestSuite.class);
		System.out.println("\n-------- Hello---------");
		System.out.println("failed tests: "+ result.getFailureCount());
		System.out.println("ignored tests: "+ result.getIgnoreCount());
		System.out.println("success: "+ result.wasSuccessful());
	}
}