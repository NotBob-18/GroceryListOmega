package com.GroceryListOmega.Repository;

import com.GroceryListOmega.Model.GroceryList;
import com.GroceryListOmega.Type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class GroceryRepository implements GroceryInterface {

    private JdbcTemplate jdbc;
    private GroceryList groceryList;

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public GroceryList getGroceryList() {
        return null;
    }

    @Override
    public GroceryList createGroceryListItem(GroceryList groceryList) {
        return null;
    }

    @Override
    public GroceryList updateGroceryListItem(GroceryList groceryList, int taskId) {
        return null;
    }

    @Override
    public GroceryList deleteGroceryListItem(int taskId) {
        return null;
    }
}
