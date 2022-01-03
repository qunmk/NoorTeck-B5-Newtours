package com.noorteck.qa.utils;

import com.noorteck.qa.pages.FlightsPage;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.RegisterPage;
import com.noorteck.qa.pages.SignOnPage;

public class ObjInitialize extends Constants {
	
	 
	
	public void initializeClassObj() {
		//initialize each page class objects here..
		
		homeObj= new HomePage();
		flightsObj= new FlightsPage();
		registerObj= new RegisterPage();
		signOnObj= new SignOnPage();
	}

}
