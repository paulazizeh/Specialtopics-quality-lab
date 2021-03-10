package edu.cscc.topics.quality.e2e;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleCloudSteps {
    private static WebDriver driver;

    static {
        /*
           Selenium can drive multiple kinds of browsers.  Chrome tends to be the most
           ubiquitous (and pretty stable).  Firefox is another good choice.  This library
           takes care of downloading a FirefoxDriver executable (which selenium uses to send
           commands to a firefox browser instance
         */
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @When("^I am on the Google Cloud homepage$")
    public void goToGoogleCloudHomepage() {
        driver.navigate().to("https://cloud.google.com");
    }

    @When("^I click on the Blog link$")
    public void clickGoogleCloudBlogLink() {

        driver.findElement((By.linkText("Blog"))).click();
    }


    @Then("^I am taken to the Google Cloud Blog page$")
    public void googleCloudBlogPage() {
        driver.navigate().to("https://cloud.google.com/blog");
    }
}
