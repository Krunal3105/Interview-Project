package Pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    LoadProperty loadProperty = new LoadProperty();

    public static final String AUTOMATE_USERNAME = "krunalpatel_f9lg6N";
    public static final String AUTOMATE_ACCESS_KEY = "sXdqfz42KJQJUMSukyGq";
    public static final String URL = "https://" + AUTOMATE_USERNAME+ ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    public static final boolean browserStack = false;

    String browserName = loadProperty.getProperty("browser");
    DesiredCapabilities caps = new DesiredCapabilities();


    public void openSelectedBrowser() {
        if (browserStack) {
            if (browserName.equalsIgnoreCase("chrome")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Chrome");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.14.0");


            } else if (browserName.equalsIgnoreCase("edge")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");
            }
            else if (browserName.equalsIgnoreCase("firefox")) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("resolution", "1920x1200");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.10.0");
            }
            try {
                driver = new RemoteWebDriver(new URL(URL), caps);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }driver.get("https://www.emerald.com/insight/");
        } else {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/BrowserDriver/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                System.setProperty("webdriver.edge.driver", "src/test/resources/BrowserDriver/msedgedriver.exe");
                driver = new EdgeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/test/resources/BrowserDriver/geckodriver.exe");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Incorrect browser name entered as : " + browserName);
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(3000, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://www.emerald.com/insight/");

        }
    }
}

