Feature: add item to cart

  Scenario: add item to cart
    When User chooses a random item
    And User adds the item to the cart
    Then Verify the alert message "Product added"
    Given User enter cart page
    Then User verifies the item is added to the cart and price

  Scenario: add item to cart and place an order
    When User chooses a random item
    And User adds the item to the cart
    Given User enter cart page
    And User clicks on place the order
    Then User fills the details on the place order page with "Ilan", "Israel", "Tel-Aviv", "456456", "02", "2025"
    And User verifies the success message title "Thank you for your purchase!"