package Pages;

import org.openqa.selenium.By;

public class YearFilter extends Utils {
    LoadProperty loadProperty = new LoadProperty();

    private By _searchBox = By.xpath("//*[@id=\"terms\"]");
    private By _acceptCookies = By.xpath("//*[@id=\"cookies-consent\"]/div/div[1]/div/div/div[2]/button[1]");
    //private By _searchButton = By.cssSelector("button[type=\"submit\"]");  //manually click it...can't click by locator
    private By _lastWeek = By.xpath("//*[@id=\"mainContent\"]/section[1]/div/div[2]/section/div/section[2]/ul/li[1]/a");
    private By _cancelButton = By.cssSelector("a[class=\"intent-current-sort-date-filter fas fa-times\"]");
    private By _lastSixMonths = By.cssSelector("a[title=\"Filter by: Last 6 months.\"]");
   // private By _cancel6Months = By.cssSelector("a[title=\"Clear filter by Last 6 months.\"]");
    private By _yearFrom = By.cssSelector("input[name=\"yearFrom\"]");
    private By _toYear = By.cssSelector("input[name=\"yearTo\"]");
    private By _goButton =By.xpath("/html/body/div[2]/main/section[1]/div/div[2]/section/div/section[2]/ul/li[7]/a");
    private By _sortedByRelevanceButton = By.id("sortByButton");
    private By _newestToOldest = By.xpath("//*[@id=\"mainContent\"]/header/div[1]/div[3]/div/div/a[2]");
    private By _contentAccessTo = By.xpath("//*[@id=\"mainContent\"]/section[1]/div/div[2]/section/div/section[1]/div[1]/a");
    private By _contentOpenAccess = By.xpath("//*[@id=\"mainContent\"]/section[1]/div/div[2]/section/div/section[1]/div[2]/a");
    private By _clearDate = By.xpath("//*[@id=\"mainContent\"]/section[1]/div/div[2]/section/div/section[2]/a");


    public void textInSearchBox(){
        enterText(_searchBox,loadProperty.getProperty("Text"));
       //clickOnElement(_searchButton);
    }
    public void acceptCookie(){
        clickOnElement(_acceptCookies);
    }
    public void resultPageTest(){
        driver.get("https://www.emerald.com/insight/search?q=Transport");
    }
    public void lastWeekTest(){
        clickOnElement(_lastWeek);}

    public void clickCancelSignTest(){
        clickOnElement(_cancelButton);

    }
    public void lastSixMonthsTest(){
        clickOnElement(_lastSixMonths);
       // clickOnElement(_cancelButton);
    }
    public void fromYearToYear(){
        enterText(_yearFrom,loadProperty.getProperty("From"));
        enterText(_toYear,loadProperty.getProperty("To"));
        //clickOnElement(_goButton);
        driver.get("https://www.emerald.com/insight/search?q=Transport&p=1&fromYear=2000&toYear=2022");
    }
    public void relevanceButtonTest(){
        clickOnElement(_sortedByRelevanceButton);
        clickOnElement(_newestToOldest);
    }
    public void contentAccessTest(){
        clickOnElement(_contentAccessTo);
        clickOnElement(_contentOpenAccess);
    }
    public void clearDateTest(){
        clickOnElement(_clearDate);
    }






}