package com.e2eTests.automatedTests.authentication.stepDefinitions;

import org.junit.Assert;

import com.e2eTests.automatedTests.authentication.pageObjects.AuthenticationPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

public class AuthenticationStepDefinitions {
	
	 private AuthenticationPage authenticationPage;

	    public AuthenticationStepDefinitions() {
	        this.authenticationPage = new AuthenticationPage();
	    }

	 /*Login*/
	 @Given("^Je me connecte sur l'application OrangeHRM$")
	 public void jeMeConnecteSurLApplicationOrangeHRM() throws Throwable {
		 authenticationPage.goToHomePage();
	 }

	@When("^Je saisis le username \"([^\"]*)\"$")
	public void jeSaisisLeUsername(String name) throws Throwable {
		authenticationPage.fillUserName(name);

	}

	@When("^Je saisis le password \"([^\"]*)\"$")
	public void jeSaisisLePassword(String pswd) throws Throwable {
		authenticationPage.fillPassword(pswd);

	}

	@When("^Je clique sur le boutton LOGIN$")
	public void jeCliqueSurLeBouttonLOGIN() throws Throwable {
		authenticationPage.clickLoginButton();

	}

	@Then("^Je me redirige vers la page home \"([^\"]*)\"$")
	public void jeMeRedirigeVersLaPageHome(String msg) throws Throwable {
		String message = AuthenticationPage.welcomeMessage.getText();
		Assert.assertTrue(message.contains(msg));
	}

}


