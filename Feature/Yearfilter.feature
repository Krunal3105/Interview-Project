Feature: Emerald Insight
  @Regression
  Scenario: Emerald Year Filter Test
    When User is on homepage and verify page title
    Then User enter some Text in search box and then click on search button
    Then User is on search result page and verify the page title
    When User click on Last Week Link and verifies with search result
    Then User click on cancel sign from Last Week
    Then User click on Last six months and verifies with search result
    Then User click on cancel sign from six months
    # bug in go button....you can manually click it
    Then User enter From year and To year and click on Go
    # Newest date suppose to be in January2022 instead of December 2021
    Then User go on sorted by relevance and click on newest to oldest from drop down
    # Fluctuate result or unstable result
    Then User click on only content i have excess to and only open access both
    Then User click on cancel button from year to year



