package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

	WebDriver driver;
	public ProductsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductBtn;
	public WebElement getCreateProductBtn() {
		return createProductBtn;
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductBtn1;
	public WebElement getCreateProductBtn1() {
		return createProductBtn1;
	}
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement createProductBtn2;
	public WebElement getCreateProductBtn2() {
		return createProductBtn2;
	}
	
}
