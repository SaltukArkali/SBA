package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.ParaBankPage01;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01Login {

    ParaBankPage01 paraBankPage01=new ParaBankPage01();
    Actions actions = new Actions(Driver.getDriver());

    @Given("User enters the main page")
    public void user_enters_the_main_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("paraBank_url"));
        ReusableMethods.waitFor(1);
        paraBankPage01.customerLogin.isDisplayed();
    }

    @Given("User enters username and password")
    public void user_enters_username_and_password() {
        paraBankPage01.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        paraBankPage01.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @Given("User clicks the log in button")
    public void user_clicks_the_log_in_button() {
        ReusableMethods.waitFor(1);
        paraBankPage01.logInButton.click();
    }

    @Given("User can see his name on the left side of the page")
    public void user_can_see_his_name_on_the_left_side_of_the_page() {
        System.out.println(paraBankPage01.nameSurnameText.getText());
        paraBankPage01.nameSurnameText.isDisplayed();
    }

    @Given("User is able to see accounts overview")
    public void user_is_able_to_see_accounts_overview() {
        System.out.println(paraBankPage01.accountsOverviewTitle.getText());
        paraBankPage01.accountsOverviewTitle.isDisplayed();
    }

    @Given("User is able to see total balance under the accounts")
    public void user_is_able_to_see_total_balance_under_the_accounts() {
        paraBankPage01.totalAmount.isDisplayed();
        System.out.println(paraBankPage01.totalAmount.getText());
    }

    @Then("User clicks log out button")
    public void user_clicks_log_out_button() {
        paraBankPage01.logOutLink.click();
    }

    @Given("User enters false username {string} and password {string}")
    public void user_enters_false_and(String username, String password) {
        paraBankPage01.usernameBox.sendKeys(username);
        ReusableMethods.waitFor(1);
        paraBankPage01.passwordBox.sendKeys(password);
        ReusableMethods.waitFor(1);
        paraBankPage01.logInButton.click();
    }

    @Then("User can not log in and verifies the Error message is displayed")
    public void user_can_not_log_in_and_verifies_the_Error_message_is_displayed() {
        ReusableMethods.waitFor(2);
        Assert.assertTrue(paraBankPage01.errorMessage.isDisplayed());
        System.out.println(paraBankPage01.errorMessage.getText());
        Assert.assertEquals(paraBankPage01.errorMessage.getText(),"Error!");
        Assert.assertTrue(paraBankPage01.errorText.isDisplayed());
        System.out.println(paraBankPage01.errorText.getText());
        Assert.assertEquals(paraBankPage01.errorText.getText(),"Please enter a username and password.");
    }

}
