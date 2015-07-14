package com.mycompany.cucumber;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pandian on 7/13/15.
 */
public class StepDef {
    Catalog catalog = null;
    ShoppingCart cart = null;
    Item selectedItem;
    int itemQuantity;
    List<ShoppingCartItem> selectedShoppingCartItems = new ArrayList<ShoppingCartItem>();
    int cartQuantity;


    @Given("^catalog has following items:$")
    public void catalogHasFollowingItems(List<Item> items) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable . one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        catalog = new Catalog();
        catalog.setItemList(items);
    }



    @Given("^User selects (.*) from the catalog page$")
    public void userSelectsPenFromThePage(String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();

        List<Item> items = catalog.getItemList();
        for (Item item:items) {
            if (item.getName().equals(itemName)) {
                this.selectedItem = item;
                break;
            }
        }
    }


    @Given("^shopping cart is empty$")
    public void shoppingCartIsEmpty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cart = new ShoppingCart();
    }

    @When("^click on Add to cart button$")
    public void clickOnAddToCartButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for(ShoppingCartItem item: selectedShoppingCartItems) {
            cart.add(item);
        }
    }

    @And("^quantity selection left as default$")
    public void quantitySelectionLeftAsDefault() throws Throwable {
        this.itemQuantity = 1;
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        shoppingCartItem.setItem(selectedItem);
        shoppingCartItem.setQuantity(itemQuantity);
        selectedShoppingCartItems.add(shoppingCartItem);

    }

    @Then("^shopping cart should increase quantity from (\\d+) to (\\d+)$")
    public void penShouldGetAddedToTheShoppingCart(int defaultQuantity, int itemQuantity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(cartQuantity,defaultQuantity);
        Assert.assertEquals(cart.getTotalQuantity(),itemQuantity);
    }
}
