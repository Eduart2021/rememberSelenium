package Page.Website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Web;

public class contact {
    By email = By.xpath("//input[@type=\"email\"]");
    By textName = By.xpath("//input[@type=\"text\"]");
    By getThetext = By.xpath("//h4[@data-element-type=\"paragraph\"]");
    By enterPhone = By.xpath("//input[@type=\"tel\"]");

    public void sendText(String name){
        WebElement enterText = Web.getDriver().findElement(textName);
        enterText.sendKeys(name);
    }
    public void enterEmail(String pass){
        Web.getDriver().findElement(email).sendKeys(pass);
    }
    public void getTheName(){
        WebElement text = Web.getDriver().findElement(getThetext);
        System.out.println("Form text header : " + text.getText());
    }
    public void enterPhone(int number){
        WebElement enterNumber = Web.getDriver().findElement(enterPhone);
        enterNumber.sendKeys(String.valueOf(number));
    }
}
