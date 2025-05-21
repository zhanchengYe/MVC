package com.itheima.service;
import com.itheima.model.Dish;
import java.util.List;

public interface DishService {
    List<Dish> getAllDishes();
    List<Dish> getDishesByCategory(String category);
    Dish getDishById(Integer id);
    boolean addDish(Dish dish);
    boolean updateDish(Dish dish);
    boolean deleteDish(Integer id);
}