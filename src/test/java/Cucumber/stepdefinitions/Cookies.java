package Cucumber.stepdefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cookies {
    private boolean CookieBelly;
    private boolean belly;

    @Given("I have {int} cookies in my belly")
    public void i_have_cookies_in_my_belly(int cookies) {
        if (cookies > 1)
        {
            CookieBelly=true;
            System.out.println("Give I have " + cookies + " cookies in my belly");
        }
        else {
            CookieBelly=false;
            System.out.println("Given I have no cookies in my belly");
        }
    }
    @When("I wait {int} hour")
    public void i_wait_hour(int hour) {
        if (hour < 1)
        {
            belly = false;
            System.out.println("When I do no wait ");
        }else {
            belly =true;
            System.out.println("When I wait " + hour + " hour");
        }

    }

    @Then("my belly should growl")
    public void my_belly_should_growl() {
        if(CookieBelly && belly)
        {
            System.out.println("Then my belly should growl");
        }else{
            System.out.println("Then my belly should be full");
        }
    }
}
