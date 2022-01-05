
package com.noorteck.qa.test;

import org.testng.asserts.SoftAssert;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {
	
		String url="https://demo.guru99.com/test/newtours/";
		
		CommonUI.openBrowser("chorme");
		
		CommonUI.navigate(url);
		
		initializeClassObj();
		
		
		NewtourTestOne();
		NewtourTestTwo();
		NewtourTestThree();
		
		CommonUI.quitBrowser();
		
		}
	
	public static void NewtourTestOne() {
		
		homeObj.clickSignOn();
		signOnObj.enterUserName("123456");
		signOnObj.enterPassword("123456");
		signOnObj.clickSubmit();
		homeObj.LoginSuccess();
		
		String expectedM="Login Successfully";
		String actualM=homeObj.LoginSuccess();
		
		SoftAssert softAssert= new SoftAssert();
		softAssert.assertEquals(expectedM, actualM);
		softAssert.assertAll();
		
		homeObj.ThankYou();
		
		String expectMSG="Thank you for Loggin.";
		String actMSG=homeObj.ThankYou();
		
		SoftAssert softAssert2= new SoftAssert();
		softAssert2.assertEquals(expectMSG, actMSG);
		softAssert2.assertAll();
			
	}
	
	public static void NewtourTestTwo() {
		
		homeObj.clickRegister();
		registerObj.enterFirstName("John");
		registerObj.enterLastName("Cena");
		registerObj.enterPhone("7037770000");
		registerObj.enterEmail("jcena@gmail.com");
		registerObj.enterAddress("123 Sesame Street");
		registerObj.enterCity("Reston");
		registerObj.enterState("VA");
		registerObj.enterPostalcode("20101");
		registerObj.selectCountry("text", "United States");
		registerObj.enterUsername("123456");
		registerObj.enterPassword("123456");
		registerObj.enterConfirmPW("123456");
		registerObj.clickSubmitBTN();
		registerObj.getRegister();
		
		//verify "Thank you for registering"
		//String expectedMessage="Thank you for registering";
		//String actualMessage=registerObj.getRegister();
		
		//SoftAssert softAssert= new SoftAssert();
		//softAssert.assertEquals(expectedMessage, actualMessage);
		//softAssert.assertAll();
		
	}
	 public static void NewtourTestThree() {
		 
		 homeObj.clickFlights();
		 flightsObj.OnewayRadio();
		 flightsObj.passengers("value", "3");
		 flightsObj.departingCity("value", "New York");
	     flightsObj.departingMonth("text", "January");
		 flightsObj.departingDay("value", "5");
		 flightsObj.arrivingCity("value","London");
	     flightsObj.arrivingDay("value", "31");
		 flightsObj.firstClass();
		 flightsObj.Airline("text","Unified Airlines");
		 flightsObj.continueSubmit();
		 flightsObj.message();
		 
		 String expMSG="After flight finder - No Seats Avaialble  ";
		 String actMSG=flightsObj.message();
			
			SoftAssert softAssert3= new SoftAssert();
			softAssert3.assertEquals(expMSG, actMSG);
			softAssert3.assertAll();
	 }
}


/**
		--------------------------------------	INSTRUCTIONS --------------------------------------------
			
			---> Create JAVA CLASS for each page of the application
			---> Inspect the elements and store the values 
			---> Create the class constructor
			---> Create the methods
		
			---> DONT FORGET ***** 	EACH PAGE CLASS SHOULD INHERIT CommonUI Class 				*******************
			---> DONT FORGET ***** 	DECLARE PAGE CLASS OBJECT in CONSTANTS CLASS 				*******************
			---> DONT FOGET  ***** 	INITIALIZE PAGE CLASS OBJECTS IN ObjInitialize JAVA ClASS 	*******************
			---> DONT FOGET  ***** 	CHANGE JAVA VERSION TO 1.8 									*******************
			
			
			
			---> For each test case create a method then call those methods from main method. 
			---> DONT FORGET *****	Refer to the INSTRUCTION PDF file for the test cases to automate **************
			
			---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
			---> Once pushed add US to the project then send picture in MENTORS GROUP CHAT
						 Crystal: 		--> Koritzerc23@gmail.com
						 Helen: 		--> Hnbehining@gmail.com
						 Ahmad: 		--> a.stanikzai77@gmail.com
						 Fahim: 		--> NTKBatch5


*/