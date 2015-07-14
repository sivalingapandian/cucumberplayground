package com.mycompany.cucumber;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pandian on 7/14/15.
 */
public class ShoppingCart {

    private List<ShoppingCartItem> shoppingCartItems;

    public ShoppingCart(){
        shoppingCartItems = new ArrayList<ShoppingCartItem>();
    }

    public void add(ShoppingCartItem shoppingCartItem) {
        shoppingCartItems.add(shoppingCartItem);
    }

    public int getTotalQuantity() {
        int count = 0;
        for(ShoppingCartItem shoppingCartItem: shoppingCartItems) {
            count += shoppingCartItem.getQuantity();
        }
        return count;
    }

}
