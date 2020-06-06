Feature: Logging into GTE
   Feature Description: Logging in

@login
Scenario: User should be able to log in successfully on Web
   Given I am not logged in
   Then I can successfully login
  When I am on the GTE
  Then I should see the GTE page
