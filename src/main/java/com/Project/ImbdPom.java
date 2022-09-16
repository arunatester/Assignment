package com.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ImbdPom {

	private WebDriver driver;
	@FindBy(xpath="(//ul/li/div)[15]")
	private WebElement release;
	@FindBy(xpath="(//ul/li/div)[16]")
	private WebElement country;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRelease() {
		return release;
	}

	public WebElement getCountry() {
		return country;
	}

	public ImbdPom(WebDriver driver1) {
        this.driver=driver1;
        PageFactory.initElements(driver1, this);
	}
}
