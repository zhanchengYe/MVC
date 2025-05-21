package com.itheima.service.impl;


import com.itheima.mapper.DishMapper;
import com.itheima.model.Dish;
import com.itheima.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    @Override
    public List<Dish> getAllDishes() {
        return dishMapper.getAllDishes();
    }

    @Override
    public List<Dish> getDishesByCategory(String category) {
        return dishMapper.getDishesByCategory(category);
    }

    @Override
    public Dish getDishById(Integer id) {
        return dishMapper.getDishById(id);
    }

    @Override
    public boolean addDish(Dish dish) {
        return dishMapper.addDish(dish) > 0;
    }

    @Override
    public boolean updateDish(Dish dish) {
        return dishMapper.updateDish(dish) > 0;
    }

    @Override
    public boolean deleteDish(Integer id) {
        return dishMapper.deleteDish(id) > 0;
    }
}