Feature: OrangeHCM_System_Admin_TC_1

  Scenario Outline: OrangeHCM_System_Admin_TC_1
    Given User navigates to the home page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigate to the Admin
    And User click on the add button
    And User add the the user type
      | Admin                |
      | Enabled              |
      | Odis Adalwin         |
      | username             |
      | password1            |
      | password1            |
    And User click on the save button
    And User search for system user
      | Harrison             |
      | ESS                  |
      | Enabled              |
    And User click on the search button
    And User validates the created system user details

    Examples:
      | Username | Password |
      | Admin    | admin123 |


    # run in terminal
    # mvn clean verify
    # to execute the bdd script
    # Issue Select the user role and status, To-be-continue