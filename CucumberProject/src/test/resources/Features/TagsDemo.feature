@FunctionalTest
Feature: Using of tags in Cucumber

@SmokeTest
Scenario: Scenario1
Given This is Scenario1

@SmokeTest
Scenario: Scenario2
Given This is Scenario2

@SanityTest
@SmokeTest
Scenario: Scenario3
Given This is Scenario3

Scenario: Scenario4
Given This is Scenario4

Scenario: Scenario5
Given This is Scenario5

Scenario: Scenario6
Given This is Scenario6
