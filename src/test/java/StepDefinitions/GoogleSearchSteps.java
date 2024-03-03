package StepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {
    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.MINUTES);
        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.get("https://traveledge.com/");
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        driver.findElement(By.xpath("//label[@for='destinations']")).click();
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(By.xpath("//span[@class='te-icon te-icon-location']")).get(0)).click().perform();
//
//        driver.findElements(By.xpath("//div[@tabindex='0']")).get(0).
    }

    @And("hits enter")
    public void hits_enter() {
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Explore the world')]")).isDisplayed());
    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
//        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }

}
