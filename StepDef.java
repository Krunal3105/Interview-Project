import Pages.ResultVerification;
import Pages.YearFilter;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
    ResultVerification rp = new ResultVerification();
    YearFilter yp = new YearFilter();

    @When("^User is on homepage and verify page title$")
    public void user_is_on_homepage_and_verify_page_title() {
        rp.verificationOfApplicationURL();
        yp.acceptCookie();

    }

    @Then("^User enter some Text in search box and then click on search button$")
    public void user_enter_some_Text_in_search_box_and_then_click_on_search_button() {
        yp.textInSearchBox();
    }

    @Then("^User is on search result page and verify the page title$")
    public void user_is_on_search_result_page_and_verify_the_page_title(){
         yp.resultPageTest();
         rp.verificationOfSearchResultPage();
    }

    @When("^User click on Last Week Link and verifies with search result$")
    public void user_click_on_Last_Week_Link_and_verifies_with_search_result() {
        yp.lastWeekTest();
        //rp.verificationOfSearchResultCount();
    }

    @Then("^User click on cancel sign from Last Week$")
    public void user_click_on_cancel_sign_from_Last_Week() {
        yp.clickCancelSignTest();
    }

    @Then("^User click on Last six months and verifies with search result$")
    public void user_click_on_Last_six_months_and_verifies_with_search_result() {
        yp.lastSixMonthsTest();
        //rp.verificationOfSearchResultCount();
    }

    @Then("^User click on cancel sign from six months$")
    public void user_click_on_cancel_sign_from_six_months() {
        yp.clickCancelSignTest();
    }

    @Then("^User enter From year and To year and click on Go$")
    public void user_enter_From_year_and_To_year_and_click_on_Go() {
        yp.fromYearToYear();
    }

    @Then("^User go on sorted by relevance and click on newest to oldest from drop down$")
    public void user_go_on_sorted_by_relevance_and_click_on_newest_to_oldest_from_drop_down(){
        yp.relevanceButtonTest();
    }

    @Then("^User click on only content i have excess to and only open access both$")
    public void user_click_on_only_content_i_have_excess_to_and_only_open_access_both() {
        yp.contentAccessTest();
    }

    @Then("^User click on cancel button from year to year$")
    public void user_click_on_cancel_button_from_year_to_year() {
        yp.clearDateTest();
    }

}
