package Page.Website;

import Page.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriver.Web;

import java.util.List;

public class loadingOne extends BasePage {

    By className = By.className("//*[@class=\"photogallery-row\"]");
    By cssSelector = By.cssSelector("");
    By ids = By.id("");
    By linkText = By.linkText("");
    By name = By.name("");
    By partialLinkText = By.partialLinkText("");
    By tagName = By.tagName("#");
    By rows = By.xpath("//*[@class=\"photogallery-row\"]");
    // multiple elements
    List<WebElement> anchors = Web.getDriver().findElements(By.tagName("a"));
    // find element inside another element
    WebElement div = Web.getDriver().findElement(By.tagName("div")).findElement(By.tagName("a"));

    String pageName ="";
    public void webPage(){
        pageName = Web.getDriver().getTitle();
        System.out.println("page title is : "+pageName);
    }
    public void verifyMe(){
        Assert.assertEquals(pageName, "Programming Languages");
    }
    public void clickContact(){
        By clickBtn = By.xpath("//a[@class=\"unifiednav__item  dmUDNavigationItem_010101783271\"]");
        WebElement button = Web.getDriver().findElement(clickBtn);
        button.click();
    }



}
