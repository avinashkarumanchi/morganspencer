package com.Morgan.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DetailsEntryPage {
	private By Name = By.xpath("//input[@id='inputName']");
	private By Birthdate = By.xpath("//input[@id='inputBirthday']");
	private By Submitbutton = By.xpath("//button[@id='submitButton']");
	private By NameError = By.xpath("//span[@id='help_name']");
	private By BirthdateError = By.xpath("//span[@id='help_birthday']");
	
	
	
	public WebDriver driver;
	
	public DetailsEntryPage(WebDriver driver) {
		this.driver = driver;

	}

	
	public void getNameErrorMessage() {

		String actualErrorMessage = "incorrect symbols";
		String expectedErrorMessage = driver.findElement(NameError).getText();
		System.out.println(expectedErrorMessage);
		assert actualErrorMessage.equals(expectedErrorMessage);

	}

	public void getDateErrorMessage() {

		String actualErrorMessage = "wrong date";
		String expectedErrorMessage = driver.findElement(BirthdateError).getText();
		System.out.println(expectedErrorMessage);
		assert actualErrorMessage.equals(expectedErrorMessage);

	}

	
	public void Name(String name) {
		driver.findElement(Name).sendKeys(name);
	}

	public void Submitbutton() {
		driver.findElement(Submitbutton).click();

	}


	public void Birthdate(String birthdate) {
		driver.findElement(Birthdate).sendKeys(birthdate);
				
	}
	
}
