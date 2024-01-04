package StepDefinitions;

import Setup.PageObjectManager;
import io.cucumber.java.en.*;
import pageObjects.*;

import java.io.IOException;
import java.time.Duration;
import java.util.logging.Logger;

import static Setup.AppiumSetup.launchApp;

public class  Steps extends PageObjectManager {

//    Logger logger = Logger.getLogger("Steps.class");
        @Given("I launch the mobile application")
        public void I_launch_Application() {
                driver = launchApp();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        @When("I am on the Welcome Screen")
        public void i_am_on_the_welcome_screen() {

        }
        @When("I click the Login button")
        public void i_click_the_login_button() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("Login Page should be visible")
        public void login_page_should_be_visible() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }

        @When("I click the Register button")
        public void i_click_the_register_button() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("Register Page should be visible")
        public void register_page_should_be_visible() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I enter your name field")
        public void i_enter_your_name_field() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I enter a valid email address")
        public void i_enter_a_valid_email_address() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I click the selectCountry Dropdown")
        public void i_click_the_select_country_dropdown() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("Search Country page should be visible")
        public void search_country_page_should_be_visible() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I search a country name")
        public void i_search_a_country_name() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("The searched country should be listed")
        public void the_searched_country_should_be_listed() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I click searched country")
        public void i_click_searched_country() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("Expected country code should visible")
        public void expected_country_code_should_visible() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I enter a valid password")
        public void i_enter_a_valid_password() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I check Term and Conditions")
        public void i_check_term_and_conditions() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @When("I click on Register button")
        public void i_clik_on_register_button() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }
        @Then("User should proceed to otp screen")
        public void user_should_proceed_to_otp_screen() {
                // Write code here that turns the phrase above into concrete actions
                throw new io.cucumber.java.PendingException();
        }


}


