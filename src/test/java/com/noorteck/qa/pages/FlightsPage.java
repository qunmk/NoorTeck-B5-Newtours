package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI {

	@FindBy(xpath = "//*[@value='roundtrip']")
	WebElement radioRoundTrip;

	@FindBy(xpath = "//*[@value='oneway']")
	WebElement radioOneway;

	@FindBy(xpath = "//*[@name='passCount']")
	WebElement selectPassengers;

	@FindBy(xpath = "//*[@name='fromPort']")
	WebElement selectDepartingFrom;

	@FindBy(xpath = "//*[@name='fromMonth']")
	WebElement selectDepartingMonth;

	@FindBy(xpath = "//*[@name='fromDay']")
	WebElement selectDepartingDay;

	@FindBy(xpath = "//*[@name='toPort']")
	WebElement selectArrivingCity;

	@FindBy(xpath = "//*[@name='toMonth']")
	WebElement selectArrivingMonth;

	@FindBy(xpath = "//*[@name='toDay']")
	WebElement selectArrivingDay;

	@FindBy(xpath = "//*[@value='Coach']")
	WebElement radioEconomy;

	@FindBy(xpath = "//*[@value='Business']")
	WebElement radioBusiness;

	@FindBy(xpath = "//*[@value='First']")
	WebElement radioFirst;

	@FindBy(xpath = "//*[@name='airline']")
	WebElement selectAirline;

	@FindBy(xpath = "//*[@name='findFlights']")
	WebElement continueBTN;

	@FindBy(xpath = "//*[@size='4']")
	WebElement mainMessage;

	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}

	public void roundtripRadio() {
		click(radioRoundTrip);
	}

	public void OnewayRadio() {
		click(radioOneway);
	}
	
	public void passengers(String methodName, String indexTextValue) {
		selectFromDropdown(selectPassengers, methodName, indexTextValue);
	}

	public void departingCity(String methodName, String indexTextValue) {
		selectFromDropdown(selectDepartingFrom, methodName, indexTextValue);
	}

	public void departingMonth(String methodName, String indexTextValue) {
		selectFromDropdown(selectDepartingMonth, methodName, indexTextValue);
	}

	public void departingDay(String methodName, String indexTextValue) {
		selectFromDropdown(selectDepartingDay, methodName, indexTextValue);
	}

	public void arrivingCity(String methodName, String indexTextValue) {
		selectFromDropdown(selectArrivingCity, methodName, indexTextValue);
	}

	public void arrivingMonth(String methodName, String indexTextValue) {
		selectFromDropdown(selectArrivingMonth, methodName, indexTextValue);

	}

	public void arrivingDay(String methodName, String indexTextValue) {
		selectFromDropdown(selectArrivingDay, methodName, indexTextValue);

	}

	public void ecomonyClass() {
		click(radioEconomy);

	}

	public void businessClass() {
		click(radioBusiness);

	}

	public void firstClass() {
		click(radioFirst);

	}

	public void Airline(String methodName, String indexTextValue) {
		selectFromDropdown(selectAirline, methodName, indexTextValue);

	}

	public void continueSubmit() {
		click(continueBTN);

	}

	public String message() {
		return getText(mainMessage);
	}

}
