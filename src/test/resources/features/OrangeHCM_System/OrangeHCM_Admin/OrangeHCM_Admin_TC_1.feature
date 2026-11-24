Feature: OrangeHCM_System_TC_1

  Scenario Outline: OrangeHCM_System_TC_1
    Given User navigates to the home page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button

    Examples:
      | Username | Password |
      | Admin    | admin123 |


    # run in terminal
    # mvn clean verify
    # to execute the bdd script