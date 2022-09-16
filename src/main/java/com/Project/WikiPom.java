package com.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiPom {

	private WebDriver driver;
	
	@FindBy(xpath="//table[@class='infobox vevent']/tbody/tr[12]/td")
    private WebElement release;
	@FindBy(xpath="//table[@class='infobox vevent']/tbody/tr[14]/td")
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

	public WikiPom(WebDriver driver1) {
           this.driver=driver1;
           PageFactory.initElements(driver1, this);
	}
	
}
