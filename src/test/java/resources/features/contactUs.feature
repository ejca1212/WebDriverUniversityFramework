Feature: Submit data to webdriveruniversity.com using contact us form

  Scenario: Submit data via contact us form
    Given I access webdriveruniversity contact us form
    When I enter a valid firstname
    When I enter a valid lastname
      | woods | jackson | jones |
    And I enter a vlid email address
    And I enter comments
      | example comments one | example comment two |
    When I click on the submit button
    Then The information should successfylly be submitted via the contact us form