Feature: Cucumber Duplicate Checker
  
  This tool will:- 
  1) parse cucumber feature files.
  2) store parsed data into Java objects.
  3) identify duplicate feature files (by name).
  4) identify duplicate background steps.
  5) identify duplicate scenarios.
  6) identify duplicate scenario outlines.
  7) identify duplicate steps.
  8) identify steps that already exist in background.
  9) move repeated Given steps into Background.
  10) change consecutive give, when, then steps into and/but steps.
  11) identify long/short scenarios.
  12) identify long background.
  13) identify if there are more that 1 'When' step.
  14) identify if a step consists of the word 'And'.
  15) identify if a step consists of the word 'But'.
  16) identify if similar scenarios can be combined into a scenario outline.
  17) identify if rows in Examples table are repeated.

  Scenario: Duplicate Cucumber features
    Given two or more feature files
    When they have the same/similar titles
    Then they are duplicates

  Scenario: Duplicate Cucumber scenarios
    Given two or more scenarios
    And they are under the same feature
    When they have the same/similar title or description
    Then they are duplicates

  Scenario: Duplicate Cucumber steps
    Given a scenario that has more than one step
    When a step is the same/similar as another step
    And they are under the same scenario
    Then they are duplicates

  Scenario: Duplicate Cucumber scenario outlines
    Given two or more scenario outlines
    And they are under the same feature
    When they have the same/similar title or description
    Then they are duplicates

  Scenario: Pre-condition step repeated in every scenario
    Given every scenario has the same 'Given' step
    And they are under the same feature
    Then they should be moved to the background

  Scenario: Consecutive 'Given'/'When'/'Then' steps in a scenario/background
    Given a scenario or a background
    And there are 'Given'/'When'/'Then' steps underneath each other
    Then they should be changed to 'And' or 'But' steps

  Scenario: Cucumber scenario is too long
    Given a scenario that has more than 5 steps
    Then it is too long

  Scenario: Cucumber scenario is too short
    Given a scenario that has less than 3 steps
    Then it is too short

  Scenario: Cucumber background is too long
    Given a background that has more than 4 steps
    Then it is too long

  Scenario: A step that is doing more than one thing
    Given a step that has the word 'and' or 'but' in it
    Then it is a conjunctive step
    And it should be split into a 'And' or 'But' step

  Scenario: Two or more scenarios that have different input/output values
    Given two or more scenarios that are sharing similar titles
    And their steps have different singular input/output values
    Then they can be combined into a scenario outline
    
  Scenario: Repeated table rows
  	Given a scenario outline
  	And there are repeated rows in the examples table
  	Then they are duplicates
