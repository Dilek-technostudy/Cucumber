Feature: Create a City

  Scenario Outline:  City Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on City
    And Click on plus icon
    And Type in the Name "<CityName>"
    And Choose any value from the dropdown
    When Click on save button
    Then "<CityName>" should be displayed
    And Remove the data "<CityName>"
    Then Verify data is removed "<CityName>"

    Examples:
      | CityName |
      |   city1   |
      |   city2   |
      |   city3   |



# Can you run the scanario outline with out scenario  > yes you can run it

# Feature , Scenario , Scenario outline , Given ANd then When   annotations