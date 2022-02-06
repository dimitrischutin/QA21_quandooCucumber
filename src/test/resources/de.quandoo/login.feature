Feature: Quandoo Login Feature
  In order to see the user area
  I log in to the website

  @validDataLogin
  Scenario: Successful Login

    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    When I insert valid user credentials
    And I click on Login button
    Then I should see Homepage

    When I hover on the User icon
    Then I see Log out item menu

    When I click on Log out item menu
    Then I should see Homepage

  @invalidPasswordLogin
  Scenario Outline: Login with invalid password

    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    And I insert a valid email and an invalid password
      | email   | password   |
      | <email> | <password> |

    And I click on Login button
    Then Message appeared
    Examples:
      | email               | password   |
      | iryna.ayguen@web.de | Ira123456_ |
      | iryna.ayguen@web.de | Ira123654_ |


  @invalidFakerEmailLogin
  Scenario: Login with an invalid email from faker

    Given I am on the Homepage
    When I click on the Login icon
    Then I see Login page

    When I insert invalid Faker-email
    And I click on Login button
    Then Message appeared
