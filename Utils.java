package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
//to put generic methods
public class Utils extends BasePage {


    public static void clickOnElement (By by){
        driver.findElement(by).click();
    }

    public static void enterText (By by,String text){
        driver.findElement(by).sendKeys(text);
    }

    public static void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


