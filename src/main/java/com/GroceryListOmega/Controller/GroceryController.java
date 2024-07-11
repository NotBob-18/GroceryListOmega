package com.GroceryListOmega.Controller;

import com.GroceryListOmega.Model.GroceryList;
import com.GroceryListOmega.Service.GroceryService;
import com.GroceryListOmega.Type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GroceryController implements GroceryInterface {

    @Autowired
    private GroceryService groceryService;

    @Autowired
    private GroceryList groceryList;


    @GetMapping("/grocery")
    @Override
    public GroceryList getGroceryList() {
        return groceryService.getGroceryList();

    }

    @PostMapping("/grocery/create")
    @Override
    public GroceryList createGroceryListItem(GroceryList groceryList) {
        groceryService.createGroceryListItem(groceryList);
        return groceryList;

    }

    @PutMapping("/grocery/update/{taskId}")
    @Override
    public GroceryList updateGroceryListItem(GroceryList groceryList, @PathVariable int taskId) {
        groceryService.updateGroceryListItem(groceryList, taskId);
        return groceryList;

    }

    @DeleteMapping("/grocery/delete/{taskId}")
    @Override
    public GroceryList deleteGroceryListItem(@PathVariable int taskId) {
        return groceryService.deleteGroceryListItem(taskId);

    }
}
