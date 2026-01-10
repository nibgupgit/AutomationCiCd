package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class loginStepDef {

        @Given("^Parabank Application is Launched$")
        public void launchAppli(){
            System.out.println("Parabank Application has been launched");

        }

        @And("^Login Page is displayed to the user$")
        public void displayLoginPage(){
            System.out.println("Login Page is displayed");
        }

        @Given("^I provide correct credentials$")
        public void enterCreds()
        {
            // Write code here that turns the phrase above into concrete actions
            System.out.println("My first Given clause");
        }

        @When("^I click on Login button$")
        public void clickLogin(){
            System.out.println("My first When clause");
        }


       @Then("^I am able to view the Parabank Home page$")
       public void viewHomePage(){
            System.out.println("My first Then clause");
       }

       @And("^The expected links on home page are visible$")
       public void verifyExpectedLinks(){
           System.out.println("My first And clause");
       }
}
