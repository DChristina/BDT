package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class MyStepdefs {
    @Given("^test$")
    public void test() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true); //throw new PendingException();
    }


    @And("^testSecond$")
    public void testsecond() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);// throw new PendingException();
    }

    @Then("^testThird$")
    public void testthird() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true);// throw new PendingException();
    }
}