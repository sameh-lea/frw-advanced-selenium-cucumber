package com.e2eTests.automatedTests.authentication.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTests.automatedTests.utilis.BasePage;

public class AuthenticationPage extends BasePage {

	private static final String HOME_PAGE_URL = "https://opensource-demo.orangehrmlive.com";

	public AuthenticationPage() {
		PageFactory.initElements(driver, this);
	}

	public void goToHomePage() {
		driver.get(HOME_PAGE_URL);
		wait.forLoading(5);
	}

	/* Locators */
	final static String USERNAME_ID = "txtUsername";
	final static String PASSWORD_ID = "txtPassword";
	final static String  BUTTON_lOGIN_ID= "btnLogin";
	final static String  WELCOME_MESSAGE= "welcome";

	/*@Findby*/
	@FindBy(how=How.ID, using =USERNAME_ID)
	public static WebElement username;
	@FindBy(how=How.ID, using = PASSWORD_ID)
	public static WebElement password;
	@FindBy(how = How.ID, using = BUTTON_lOGIN_ID)
	public static WebElement buttonLogin;
	@FindBy(how = How.ID, using = WELCOME_MESSAGE)
	public static WebElement welcomeMessage;

	/* Methods*/
	public void fillUserName( String name) {
		username.sendKeys(name);
	}
	public void fillPassword( String pswd) {
		password.sendKeys(pswd);
	}
	public void clickLoginButton( ) {
		buttonLogin.click();
	}

}
