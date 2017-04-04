Feature: OrangeHRM login

  Scenario: login with valid credientials
    Given visit OrangeHRM login page
    When enter the username "linda.anderson" and password "linda.anderson"
    And click on the Login button
    Then user should able to see the orangeHRM homepage with welcome message "Welcome Linda"
    
    Scenario: login with Invalid credentials
    Given visit OrangeHRM login page
    When enter the username "user" and password ""
    And click on the Login button