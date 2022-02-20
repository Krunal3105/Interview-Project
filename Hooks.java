import Pages.BrowserSelector;
import Pages.Utils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
//to open browser and close browser
public class Hooks extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @Before
    public void openBrowser() {
        browserSelector.openSelectedBrowser();

    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }
}
