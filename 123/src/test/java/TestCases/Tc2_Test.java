package TestCases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listners.Listner.class)
public class Tc2_Test {
		@Test
		public void m2()
		{
		 Reporter.log("tc2 running");
		}
		
	}

