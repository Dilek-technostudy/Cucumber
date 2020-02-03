Feature: Create a Country
  Scenario:  Country Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameters
    And Click on countries
    And Click on plus icon
    And Type in the Name "<CucumberC>"
    And Type in the code "<code>"
    When Click on save button
    Then "<CucumberC>" should be displayed
    And Remove the data "<CucumberC>"
    Then Verify data is removed "<CucumberC>"

    Examples:
      |CucumberCountry|code|
      |mycuke               |  asd  |
      |mycuke2               |  sdf  |
      |mycuke3               |  dfg  |


#   Advantage of cucumber
#     Understandable for everyone in the team
#     Report will understandable for everyone as well
#



    #    Given −
#
#  It describes the pre-requisite for the test to be executed.
#
#  Example − GIVEN I am a Facebook user
#
#    When −
#
#  It defines the trigger point for any test scenario execution.
#
#  Example − WHEN I enter "<username>"
#
#    Then −
#
#    Then holds the expected result for the test to be executed.
#
#  Example − THEN login should be successful.
#
#    And −
#
#  It provides the logical AND condition between any two statements. AND can be used in conjunction with GIVEN, WHEN and THEN statement.
#
#  Example − WHEN I enter my "<username>" AND I enter my "<password>"