Feature: Create Citizenship
  Scenario:  Citizenship creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on citizenship
    And Click on plus icon
    And Type the citizenship name  "CucumCity"
    And Type the shortName "Cucity"
    When Click on save button
    Then "CucumCity" should be displayed
    And Remove the data "CucumCity"
    Then Verify data is removed "CucumCity"

