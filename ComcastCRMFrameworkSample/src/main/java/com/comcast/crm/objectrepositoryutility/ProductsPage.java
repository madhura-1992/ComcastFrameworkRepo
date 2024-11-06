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

	@FindBy(name="searchBtn")
	private WebElement ele3;
	
<<<<<<< HEAD
	@FindBy(name="search")
	private WebElement ele2;
		
	@FindBy(name="searchfield")
	private WebElement ele4;
=======
	
>>>>>>> branch 'master' of https://github.com/madhura-1992/ComcastFrameworkRepo.git
	
}
