package com.crm.comcast.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * Create organization page
 * @author sarav
 *
 */

public class CreateOrganizationPage {
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="accountname")
	private WebElement organizationTextField;
	
	@FindBy(xpath="//input[@title='Save [Alt+S]']")
	private WebElement saveButton;

	public WebElement getOrganizationTextField() {
		return organizationTextField;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	/**
	 * this method will create an organization
	 * @param orgName
	 */
	
	public void createOrganization(String orgName) {
	organizationTextField.sendKeys(orgName);
	saveButton.click();
	}
}
