Feature:Login to system

  Background:
    Given  Open Hrm application

  @loginAdmin
    Scenario: Login with Admin account
    Given I input Admin username with "Admin"
    And  I input Admin password with "admin123"
    When  I click on Login button