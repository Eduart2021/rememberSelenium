package webDriver;


import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Web {

    private static WebDriver driver;

    @Before
    public void initDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
       // WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver(options);
      //  driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/documentation/webdriver/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void closeDriver(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
