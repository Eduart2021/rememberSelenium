package StepDefinition;

import Page.BasePage;
import Page.Website.seleniumPage;
import io.cucumber.java.en.*;

public class SDseleniumWD {
    BasePage bp = new BasePage();
    seleniumPage pp = new seleniumPage();

    @Given("^the url$")
    public void goToURL(){
        System.out.println("url");
        bp.waitASec();
    }
    @And("^find the webDriver linkText$")
    public void findElement(){
        System.out.println("element output is");
        pp.headName();
        bp.waitASec();
    }
    @Then("^verify the header is WebDriver$")
    public void headText(){
        System.out.println("header");
        bp.waitASec();
        pp.readName();
    }
    @And("^verify tagName is (.+)$")
    public void verifyElement(String name){
        System.out.println("element tagname is");
        pp.readName(name);
    }
}
