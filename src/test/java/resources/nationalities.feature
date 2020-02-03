Feature: Create a Nationality
  Scenario:  Nationality Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on Nationality
    And Click on plus icon
    And Type in the Name "CuNationality"
    When Click on save button
    Then "CuNationality" should be displayed
    And Remove the data "CuNationality"
    Then Verify data is removed "CuNationality"