package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import org.testng.Assert;

public class MyStepdefsNew {
    @Given("^testlogin$")
    public void testlogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(true); //throw new PendingException();
    }
}
