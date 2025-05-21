package com.itheima.mapper;
import com.itheima.model.Dish;
import java.util.List;

public interface DishMapper {
    List<Dish> getAllDishes();
    List<Dish> getDishesByCategory(String category);
    Dish getDishById(Integer id);
    int addDish(Dish dish);
    int updateDish(Dish dish);
    int deleteDish(Integer id);
}