package Pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ResultVerification extends Utils {

    public void verificationOfApplicationURL(){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.emerald.com/insight/","Url is not matching");
    }
    public void verificationOfSearchResultPage(){
        String ResultActTitle = driver.getTitle();
        Assert.assertEquals(ResultActTitle,"Search results | Emerald Insight","Result page title mismatch");

    }
    public void verificationOfHomePageTitle(){
        String HomePageActTitle = driver.getTitle();
        Assert.assertEquals(HomePageActTitle,"Discover Journals, Books & Case Studies | emerald.com","Title is not matching");
    }
    public void verificationOfSearchResultCount(){
        String ResultCount = driver.findElement(By.className("intent_searchresultscount medium font-weight-light")).getText();
        System.out.println("count is" + ResultCount);
    }
}
