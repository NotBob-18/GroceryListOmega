package com.GroceryListOmega.Service;

import com.GroceryListOmega.Model.GroceryList;
import com.GroceryListOmega.Repository.GroceryRepository;
import com.GroceryListOmega.Type.GroceryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryService implements GroceryInterface {

    @Autowired
    private GroceryRepository groceryRepository;

    @Override
    public GroceryList getGroceryList() {
        return groceryRepository.getGroceryList();
    }

    @Override
    public GroceryList createGroceryListItem(GroceryList groceryList) {
        return groceryRepository.createGroceryListItem(groceryList);
    }

    @Override
    public GroceryList updateGroceryListItem(GroceryList groceryList, int taskId) {
        return groceryRepository.updateGroceryListItem(groceryList, taskId);
    }

    @Override
    public GroceryList deleteGroceryListItem(int taskId) {
        return groceryRepository.deleteGroceryListItem(taskId);
    }
}
