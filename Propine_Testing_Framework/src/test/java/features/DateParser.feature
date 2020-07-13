@tag
Feature: Date Parser functionality
  

  Scenario Outline: Date Parser functionality
    Given I am on Propine date parser page
    When I Enter the <date> in text box and click Submit button 
    Then I should see a <message> on the form.
   
    Examples:
| date  | message  | 
| "17-March-2020" | "Tue Mar 17 2020" | 
| "1@@@@" | "Invalid date" |    
| "17-March-20" | "Tue Mar 17 2020" |
