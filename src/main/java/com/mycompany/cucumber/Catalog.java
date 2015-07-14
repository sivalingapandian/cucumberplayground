package com.mycompany.cucumber;

import java.util.List;

/**
 * Created by pandian on 7/14/15.
 */
public class Catalog {
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    private List<Item> itemList;
}
