package com.libre.pizza.persistence.repository;

import com.libre.pizza.persistence.entity.PizzaEntity;
import org.springframework.data.repository.ListCrudRepository;

public interface IPizzaRepository extends ListCrudRepository<PizzaEntity, Integer> {
}
