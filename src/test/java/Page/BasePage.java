package Page;

import webDriver.Web;

import java.time.Duration;

public class BasePage {
    public void waitASec() {
        Web.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }
    public void wait50sec() throws InterruptedException {
        Thread.sleep(5000);
    }
}
