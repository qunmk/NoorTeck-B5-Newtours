
package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {
	
		String url="http://demo.guru99.com/test/newtours/";
		
		CommonUI commonUIObj=new CommonUI();
		
		commonUIObj.openBrowser("chorme");
		
		commonUIObj.navigate(url);
		
		ObjInitialize obj=new ObjInitialize();
		
		obj.initializeClassObj();
		
		NewtourTest testObj=new NewtourTest();
		
		testObj.NewtourTestOne();
		testObj.NewtourTestTwo();
		testObj.NewtourTestThree();
		
		commonUIObj.quitBrowser();
		
		}
	
	public void NewtourTestOne() {
		
		homeObj.clickSignOn();
		signOnObj.enterUserName("123456");
		signOnObj.enterPassword("123456");
		signOnObj.clickSubmit();
		homeObj.LoginSuccess();
		homeObj.ThankYou();
			
	}
	
	public void NewtourTestTwo() {
		
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
		//verify "Thank you for registering"
	}
	 public void NewtourTestThree() {
		 
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