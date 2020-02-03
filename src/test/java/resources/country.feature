Feature: Create a country
  Scenario:Country  Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the name "CucumberCucumber"
    And Type in the code "CucumberAAA"
    When Click on save button
    Then "CucumberCucumber" should be displayed
    And Remove the data "CucumberCucumber"
    Then Verify data is removed "CucumberCucumber"












    #   Advantage of cucumber
    #     Understandable for everyone in the team
   #     Report will understable for everyone as well
    #nd Click on countries