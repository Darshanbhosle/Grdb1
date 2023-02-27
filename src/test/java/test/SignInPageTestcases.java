package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;


import listeners.TestNGListeners;
import utility.ReadDataFromPropFile;

public class SignInPageTestcases extends BaseTest {
	
	@Test(priority=1)
	public void validateLogin() throws IOException, InterruptedException {

		
		SI.SignInToApplication(ReadDataFromPropFile.readConfigData("username"), ReadDataFromPropFile.readConfigData("password"));
		

	}
	@Test(priority=0)
	public void VerifyTitleOfPage() {
		
		SI.titleOfPage();
		
	}


    }