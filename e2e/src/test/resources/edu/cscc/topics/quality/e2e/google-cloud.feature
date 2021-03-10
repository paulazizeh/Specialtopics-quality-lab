Feature: google cloud blog tests

# Gherkin is the syntax feature files are written in.  It has the traditional Given/When/Then

Scenario: Link navigates to Google Cloud homepage
      Given I am on the Google Cloud homepage
      When I click on the Blog link
      Then I am taken to the Google Cloud Blog page