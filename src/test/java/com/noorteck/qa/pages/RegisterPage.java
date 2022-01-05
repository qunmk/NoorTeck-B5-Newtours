package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI {

	@FindBy(xpath = "//*[@name='firstName']")
	WebElement firstNameField;

	@FindBy(xpath = "//*[@name='lastName']")
	WebElement lastNameField;

	@FindBy(xpath = "//*[@name='phone']")
	WebElement phoneField;

	@FindBy(xpath = "//*[@id='userName']")
	WebElement emailField;

	@FindBy(xpath = "//*[@name='address1']")
	WebElement addressField;

	@FindBy(xpath = "//*[@name='city']")
	WebElement cityField;

	@FindBy(xpath = "//*[@name='state']")
	WebElement stateField;

	@FindBy(xpath = "//*[@name='postalCode']")
	WebElement postalCodeField;

	@FindBy(xpath = "//*[@name='country']")
	WebElement countryDropdown;

	@FindBy(xpath = "//*[@id='email']")
	WebElement usernameField;

	@FindBy(xpath = "//*[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@name='confirmPassword']")
	WebElement confirmPwField;

	@FindBy(xpath = "//*[@name='submit']")
	WebElement clickSubmit;
	
	@FindBy(xpath="//*[@size='2']")
	WebElement 	registerThanks;

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}

	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);

	}

	public void enterPhone(String phone) {
		enter(phoneField, phone);
	}

	public void enterEmail(String email) {
		enter(emailField, email);
	}

	public void enterAddress(String address) {
		enter(addressField, address);
	}

	public void enterCity(String city) {
		enter(cityField, city);
	}

	public void enterState(String state) {
		enter(stateField, state);
	}

	public void enterPostalcode(String postalCode) {
		enter(postalCodeField, postalCode);
	}

	public void selectCountry(String methodName, String indexTextValue) {

		selectFromDropdown(countryDropdown, methodName, indexTextValue);

	}

	public void enterUsername(String username) {
		enter(usernameField, username);
	}

	public void enterPassword(String password) {
		enter(passwordField, password);
	}

	public void enterConfirmPW(String confirmPW) {
		enter(confirmPwField, confirmPW);
	}

	public void clickSubmitBTN() {
		click(clickSubmit);
	}
	
	public String getRegister() {
		return getText(registerThanks);
	}

}
