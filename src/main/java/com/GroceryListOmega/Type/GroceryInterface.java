package com.GroceryListOmega.Type;

import com.GroceryListOmega.Model.GroceryList;

public interface GroceryInterface {
    // get all grocery list items
    public GroceryList getGroceryList();

     // create grocery list item
    public GroceryList createGroceryListItem(GroceryList groceryList);

    // update grocery list item
    public GroceryList updateGroceryListItem(GroceryList groceryList, int taskId);

    // delete grocery list item
    public GroceryList deleteGroceryListItem(int taskId);

}
