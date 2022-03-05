package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {
	
	WebDriver dr;
	@Given("^open browser$")
	public void open_browser() throws Throwable {
		dr=new ChromeDriver();
	    
	}

	@Given("^go to url$")
	public void go_to_url() throws Throwable {
		dr.get("");
	    
	}

	@When("^user type userid in user text box$")
	public void user_type_userid_in_user_text_box() throws Throwable {
		dr.findElement(By.id("")).sendKeys("");
	    
	}

	@When("^user type password in pass text box$")
	public void user_type_password_in_pass_text_box() throws Throwable {
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    
	}

	@Then("^user should be in his profile page\\(result\\)$")
	public void user_should_be_in_his_profile_page_result() throws Throwable {
	   
	}

	
}
