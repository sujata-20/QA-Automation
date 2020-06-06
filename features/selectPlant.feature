Feature: Selecting Plant and verifying plant information
   Feature Description:  Select a plant and view the plant information
   
@selectPlant
Scenario: User should be able to select a plant on Web
  Given I am on the MyDashboard page
  And I click on the Plant button
  Then I search for "mcher"
  And I select "Bir Mcherga"
  