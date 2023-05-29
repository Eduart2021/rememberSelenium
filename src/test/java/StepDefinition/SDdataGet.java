package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Web;

import java.util.List;

public class SDdataGet {

    By numbers = By.xpath("//tr[@class=\"team\"]");
    By numbersName = By.xpath("//tr[@class=\"team\"]");

    @Given("the page url")
    public void thePageUrl() {
        List<WebElement> webNumbers = Web.getDriver().findElements(numbers);
        int addAll = 0;
        for(WebElement ele : webNumbers){
                addAll = addAll + Integer.parseInt(ele.getText().replaceAll("[^0-9]", ""));
        }
        System.out.println("Total is: "+ addAll);
    }

    @When("find by individual name {string}")
    public void findName(String name){
        List<WebElement> webNumbers = Web.getDriver().findElements(numbersName);
        for (WebElement elem : webNumbers){
            if(elem.getText().contains(name)){
                System.out.println(elem.getText());
            }
        }
    }
}
