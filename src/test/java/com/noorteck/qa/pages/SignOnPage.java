package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI {

	@FindBy(xpath = "//*[@name='userName']")
	WebElement usernameField;

	@FindBy(xpath = "//*[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@name='submit']")
	WebElement submitBTN;
	
    public SignOnPage() {

		PageFactory.initElements(driver, this);

	}

	public void enterUserName(String username) {
		enter(usernameField, username);

	}

	public void enterPassword(String password) {
		enter(passwordField, password);
	}

	public void clickSubmit() {
		click(submitBTN);
	}

}
