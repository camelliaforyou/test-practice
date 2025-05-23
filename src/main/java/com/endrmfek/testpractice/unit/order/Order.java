package com.endrmfek.testpractice.unit.order;

import com.endrmfek.testpractice.unit.beverage.Beverage;
import org.springframework.validation.beanvalidation.SpringConstraintValidatorFactory;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private LocalDateTime orderDatetime;
    private List<Beverage> beverages;

    public Order(LocalDateTime orderDatetime, List<Beverage> beverages) {
        this.orderDatetime = orderDatetime;
        this.beverages = beverages;
    }
}
