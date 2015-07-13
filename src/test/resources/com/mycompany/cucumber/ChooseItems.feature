Feature: Customer should be able to add the selected items to the shopping cart

  As a product owner, I want a customer to be able to add the selected item to the shopping cart
  and the cart quantity should get updated by the number of items added.

  Scenario: Add one item to an empty shopping cart

    Given catalog has following items:
      |Name       |Id |
      |Pen        |1  |
      |Pencil     |2  |
      |Eraser     |3  |
    And shopping cart is empty
    And User selects 1 Pen from the catalog page
    When click on Add to cart button
    And quantity selection left as default
    Then 1 Pen should get added to the shopping cart