package Automation_StepDefinition;

import Automation_POM.POM_Class;

import automation_Runner.runnerAuto;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StepDefinition_Automation  {

   public static WebDriver driver = runnerAuto.driver;
    public static POM_Class P = new POM_Class(driver);

    @Given("the browser is launched")
    public void the_browser_is_launched() {

    }
    @Given("I navigate to the url {string}")
    public void i_navigate_to_the_url(String string) {
        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();
    }
    @Then("the home page should be visible successfully")
    public void the_home_page_should_be_visible_successfully() {
        String title = driver.getTitle();
        if (title.equalsIgnoreCase("Automation Exercise")) {
            System.out.println("Home page is visible");
        }
    }
   @When("I click on the Signup or Login button")
    public void i_click_on_the_signup_login_button() {
     P.getLogin().click();
     /* P.getEe().sendKeys("harirambalakrishnann@gmail.com");
         P.getSs().sendKeys("Hariram@24");
         P.getLog().click();*/
    }
    @Then("New User Signup should be visible")
    public void new_user_signup_should_be_visible() {
     P.getdis().isDisplayed();
    }
    @Then("I enter the name name and email address email")
    public void i_enter_the_name_name_and_email_address_email() {
     P.getUsername().sendKeys("Hariram91");
     P.getEmail().sendKeys("harirambalakrishnann@gmail.com");
    }
    @Then("I click the Signup button")
    public void i_click_the_signup_button() {
     P.getUp().click();
    }
    @Then("ENTER ACCOUNT INFORMATION should be visible")
    public void enter_account_information_should_be_visible() {
      P.getCheck().getText();
    }
    @Then("I fill in the details:")
    public void i_fill_in_the_details(io.cucumber.datatable.DataTable dataTable) {
            P.getTitle().click();
            P.getPassword().sendKeys("Hariram@24");
            P.getDate().sendKeys("15");
            P.getMonth().sendKeys("August");
            P.getYears().sendKeys("1990");
            P.getSelect().click();
    }
    @Then("I select the checkbox Sign up for our newsletter")
    public void i_select_the_checkbox_sign_up_for_our_newsletter() throws InterruptedException {
        Thread.sleep(5000);
        P.getSelect().click();
           Thread.sleep(5000);
        }
    @Then("I select the checkbox Receive special offers from our partners")
    public void i_select_the_checkbox_receive_special_offers_from_our_partners() {

    }
    @Then("I fill in the additional details:")
    public void i_fill_in_the_additional_details(io.cucumber.datatable.DataTable dataTable) {
       P.getFirstName().sendKeys("Hariram");
        P.getLastName().sendKeys("Balakrishnan");
        P.getCompany().sendKeys("Axess Technology");
        P.getAddress().sendKeys("Sagar Classic Apartment");
        P.getAddress2().sendKeys("Shollinganallr");
        Select Country = new Select(P.getCountry());
        Country.selectByIndex(1);
        P.getState().sendKeys("TamilNadu");
        P.getCity().sendKeys("Chennai");
        P.getPincode().sendKeys("600119");
        P.getNumber().sendKeys("1234567890");
    }
    @Then("I click the Create Account button")
    public void i_click_the_create_account_button() {
         P.getCreateaccount().click();
    }
    @Then("ACCOUNT CREATED should be visible")
    public void account_created_should_be_visible() {

    }
    @When("I click the Cont button")
    public void i_click_the_cont_button() {
       P.getContinuebutton().click();
    }
    @Then("Logged in as username should be visible")
    public void logged_in_as_username_should_be_visible() {

    }
    @When("I click the Delete Account button")
    public void i_click_the_delete_account_button() {
          P.getDeleted().click();
    }
    @Then("ACCOUNT DELETED should be visible")
    public void account_deleted_should_be_visible() {

    }
    @Then("I click the Continue button")
    public void i_click_the_continue_button() {
      P.getButton().click();
    }
}
