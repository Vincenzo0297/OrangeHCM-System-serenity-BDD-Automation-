OrangeHCM_Admin_TC_2.featureOrangeHCM_Admin_TC_1.featureFeature: OrangeHCM_System_Admin_TC_1

  Scenario Outline: OrangeHCM_System_Admin_TC_1
    Given User navigates to the home page
    Then User enters username '<Username>'
    And User enters password '<Password>'
    And User click on login button
    And User navigate to the Admin
    And User click on the add button
    And User add the the user type
      | Admin                |
      | Enable               |
      | Rosanna Ryan Pagac   |
      | username             |
      | password1            |
      | password1            |

    Examples:
      | Username | Password |
      | Admin    | admin123 |


    # run in terminal
    # mvn clean verify
    # to execute the bdd script