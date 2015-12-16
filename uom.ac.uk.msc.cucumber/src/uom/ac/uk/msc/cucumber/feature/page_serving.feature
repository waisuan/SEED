Feature: Serving pages from front-end
  In order to view the website content efficiently
  a visitor
  wants to load pages with caching enhancements

  Background:
    Given the page cache is clear

  Scenario: Rendering cached page with ETag
    When I go to page '/first'
    And I go to page '/first' sending the ETag
    Then I should get a 304 response code
    And I should get the same ETag header

  Scenario: Rendering cached page with ETag1
    When I go to page '/first'
    And I go to page '/first' sending the Last-Modified
    Then I should get a 304 response code
    And I should get the same Last-Modified header