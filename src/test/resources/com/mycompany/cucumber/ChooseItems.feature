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
    And User selects Pen from the catalog page
    And quantity selection left as default
    When click on Add to cart button
    Then shopping cart should increase quantity from 0 to 1


   Scenario: Add more than 1 item to an empty shopping cart

     Given catalog has following items:
       |Name       |Id |
       |Pen        |1  |
       |Pencil     |2  |
       |Eraser     |3  |
     And shopping cart is empty
     And User selects Pencil from the catalog page
     And quantity selection left as default
     And User selects Eraser from the catalog page
     And quantity selection left as default
     When click on Add to cart button
     Then shopping cart should increase quantity from 0 to 2
