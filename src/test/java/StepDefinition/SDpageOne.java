package StepDefinition;

import Page.Website.contact;
import Page.Website.loadingOne;
import io.cucumber.java.en.*;
import webDriver.Web;


public class SDpageOne {
    loadingOne lo = new loadingOne();
    contact cc = new contact();
    Web web = new Web();

    @Given("^the page url zedy3d.com$")
    public void thePageUrl() {
      // web.initDriver("https://www.zedy3d.com/blank-pageab3a8782");
        lo.webPage();
    }

    @Given("^get page title$")
    public void getPageTitle() {
        lo.verifyMe();
    }

    @Then("click contact us")
    public void assertIsTrue() {
        lo.clickContact();
    }
    @When("get the format text")
    public void formName(){
        cc.getTheName();
    }
    @Then("enter name {string}")
    public void enterName(String name) {
        cc.sendText(name);
    }
    @Then("enter email {string}")
    public void enterEmail(String name) {
        cc.enterEmail(name);
    }
    @When("send the phone {int}")
    public void enterNumber(int number) {
        cc.enterPhone(number);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
