package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("1");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("2");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("3");
    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        System.out.println("4");
    }
}
