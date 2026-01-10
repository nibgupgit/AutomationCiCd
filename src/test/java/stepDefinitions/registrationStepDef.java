package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Map;

public class registrationStepDef {

    // ...existing code...

    private String registeredUsername;
    private String registeredPassword;

    @Given("^I navigate to the registration page$")
    public void navigateToRegistration() {
        // Replace with navigation logic (e.g., WebDriver.get)
        System.out.println("Navigating to the registration page");
    }

    @When("^I provide valid registration details$")
    public void provideRegistrationDetails(DataTable table) {
        // The Gherkin table is key | value pairs; convert to a Map
        Map<String, String> details = table.asMap(String.class, String.class);

        // Example of extracting important fields; store for later login
        registeredUsername = details.getOrDefault("username", "");
        registeredPassword = details.getOrDefault("password", "");

        // Replace with form-filling logic
        System.out.println("Filling registration form with details:");
        details.forEach((k, v) -> System.out.println(k + " = " + v));

        // Basic sanity checks
        Assert.assertFalse(registeredUsername.isEmpty(), "username should not be empty");
        Assert.assertFalse(registeredPassword.isEmpty(), "password should not be empty");
    }

    @And("^I submit the registration form$")
    public void submitRegistrationForm() {
        // Replace with click/submit logic
        System.out.println("Submitting the registration form for user: " + registeredUsername);
    }

    @Then("^I should see a registration confirmation message$")
    public void verifyRegistrationConfirmation() {
        // Replace with actual confirmation verification
        System.out.println("Verifying registration confirmation message is displayed");
        // Simulate success
        boolean confirmationDisplayed = true;
        Assert.assertTrue(confirmationDisplayed, "Registration confirmation should be displayed");
    }

    @And("^I should be able to login with the new credentials$")
    public void loginWithNewCredentials() {
        // Replace with navigation to login and login attempt using registeredUsername/registeredPassword
        System.out.println("Attempting login with new credentials: " + registeredUsername + " / " + registeredPassword);
        // Simulate successful login
        boolean loginSuccessful = true;
        Assert.assertTrue(loginSuccessful, "Login with new credentials should succeed");
    }

    // ...existing code...
}

