package com.mycompany.cucumber;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

/**
 * Created by pandian on 7/13/15.
 */
public class StepDef {
    Catalog catalog = null;
    ShoppingCart cart = null;
    public class ShoppingCart {
        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public int getItemQuantity() {
            return itemQuantity;
        }

        public void setItemQuantity(int itemQuantity) {
            this.itemQuantity = itemQuantity;
        }

        public Item item;
        public int itemQuantity;

    }

    public class Catalog {
        public List<Item> getItemList() {
            return itemList;
        }

        public void setItemList(List<Item> itemList) {
            this.itemList = itemList;
        }

        private List<Item> itemList;
    }

    public class Item {
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String name;
        private int id;
    }

    @Given("^catalog has following items:$")
    public void catalogHasFollowingItems(List<Item> items) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable . one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
            catalog = new Catalog();
            catalog.setItemList(items);
    }

    @Given("^User selects (\\d+) (.*) from the catalog page$")
    public void userSelectsPenFromThePage(int itemQuantity, String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        List<Item> items = catalog.getItemList();
        for (Item item:items) {
            if (item.getName().equals(itemName)) {
                cart.setItem(item);
                cart.setItemQuantity(itemQuantity);
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
        throw new PendingException();
    }

    @When("^quantity selection left as default$")
    public void quantitySelectionLeftAsDefault() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^(\\d+) pen should get added to the shopping cart$")
    public void penShouldGetAddedToTheShoppingCart(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}
