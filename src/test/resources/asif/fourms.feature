@ramana
Feature: User can access fourms and read/write and comment

  Scenario: User can add a new topic and view in the fourm- Happy path


    Given User is in home page
    When user navigates to the 'Forums'
    Then heading with 'Forums' is shown
    When user navigates to the 'New Products'
    Then text should be shown with 'Discuss new products and industry trends'
    When user starts a new topic
    And provide title as 'Sample'
    And body as 'sample body'
    And save the fourm data
    Then I should see my fourm with name 'Sample' in the fourm page