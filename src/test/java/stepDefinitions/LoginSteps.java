package test.java.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("User enters credentials");
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        System.out.println("User logged in successfully");
    }
}