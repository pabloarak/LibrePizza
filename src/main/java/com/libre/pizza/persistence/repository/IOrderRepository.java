package com.libre.pizza.persistence.repository;

import com.libre.pizza.persistence.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface IOrderRepository extends ListCrudRepository<OrderEntity, Integer> {
}
