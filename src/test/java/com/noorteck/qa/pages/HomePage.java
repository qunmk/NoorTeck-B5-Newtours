package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI {

	@FindBy(xpath = "//*[contains(text(),'REGISTER')]")
	WebElement registerClick;

	@FindBy(xpath = "//*[contains(text(),'SIGN-ON')]")
	WebElement signOnClick;

	@FindBy(xpath = "//*[contains(text(), 'Flights')]")
	WebElement flightClick;

	@FindBy(xpath = "//*[contains(text(),'Login Successfully')]")
	WebElement mainMessage;
	
	@FindBy(xpath="//*[contains(text(),'Thank you for Loggin.')]")
	WebElement subMessage;

	public HomePage() {

		PageFactory.initElements(driver, this);
	}

	public void clickRegister() {
		click(registerClick);

	}

	public void clickSignOn() {
		click(signOnClick);

	}

	public void clickFlights() {
		click(flightClick);
	}

	public String LoginSuccess() {
		return getText(mainMessage);
	
	}
	public String ThankYou() {
		return getText(subMessage);

	}
}