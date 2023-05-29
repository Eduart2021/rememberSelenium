package Page.Website;

import Page.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import webDriver.Web;

public class seleniumPage extends BasePage {

    static By headerName =  By.xpath("//*[@class=\"td-content\"]//h1");
    By linkGettingStarted = By.xpath("//a[contains(text(),'Getting started')]");




    public void headName(){
        String name = "";
        WebElement nameE = Web.getDriver().findElement(headerName);
        name = nameE.getText();
        System.out.println(name);
    }
    public void readName(){
        String name = "";
        WebElement nameE = Web.getDriver().findElement(headerName);
        name = nameE.getTagName();
        System.out.println(name);
    }
    public void readName(String name){
        String na = "";
        WebElement nameE = Web.getDriver().findElement(headerName);
        na = nameE.getTagName();
        Assert.assertEquals(na, name);
        System.out.println(na);
    }
    public void clickGetStarted(){
        WebElement nameE = Web.getDriver().findElement(headerName);
        nameE.click();
    }
    public void getUrlGetStarted(){
        String nameE = Web.getDriver().getCurrentUrl();
        System.out.println(nameE);
    }
}
